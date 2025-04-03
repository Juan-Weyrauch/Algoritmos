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

// Usando DO-WHILE
public class Contador {
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
        Contador contador = new Contador();
        System.out.println("Usando do-while:");
        contador.mostrarContadorDoWhile();
    }
}

// Usando FOR
public class Contador {
    private static final int MAX_CONT = 50;
    private int incremento = 1;

    public void mostrarContadorFor() {
        for (int contador = 1; contador <= MAX_CONT; contador += incremento) {
            System.out.println("Contador: " + contador);
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Usando for:");
        contador.mostrarContadorFor();
    }
}
