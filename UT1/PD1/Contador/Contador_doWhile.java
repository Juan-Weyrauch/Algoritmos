// Usando DO-WHILE
public class Contador_doWhile {
    private static final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContadorDoWhile() {
        do {
            System.out.println("Contador: " + contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }

    public static void main(String[] args) {
        Contador_doWhile contador = new Contador_doWhile();
        System.out.println("Usando do-while:");
        contador.mostrarContadorDoWhile();
    }
}