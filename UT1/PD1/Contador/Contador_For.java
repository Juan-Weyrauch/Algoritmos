// Usando FOR
public class Contador_For {
    private static final int MAX_CONT = 50;
    private int incremento = 1;

    public void mostrarContadorFor() {
        for (int contador = 1; contador <= MAX_CONT; contador += incremento) {
            System.out.println("Contador: " + contador);
        }
    }

    public static void main(String[] args) {
        Contador_For contador = new Contador_For();
        System.out.println("Usando for:");
        contador.mostrarContadorFor();
    }
}