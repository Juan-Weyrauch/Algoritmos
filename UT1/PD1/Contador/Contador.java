// Usanod WHILE
public class Contador {
    private static final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContadorWhile() {
        while (contador <= MAX_CONT) {
            System.out.println("Contador: " + contador);
            contador += incremento;
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Usando while:");
        contador.mostrarContadorWhile();
    }
}

