public class ValueOfDemo {
    public static void main(String[] args) {

        // this program requires two 
        // arguments on the command line 
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue(); 
            float b = (Float.valueOf(args[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
    }
}

/*
 a) indicar cuál es la salida cuando se invoca con parámetros 13.4 y 66.1.
    El programa devuelve estos valores:
    a + b = 79.5
    a - b = -52.699997
    a * b = 885.7399
    a / b = 0.20272315
    a % b = 13.4

 b) ¿cómo debería modificarse el código si los parámetros de línea de comando fueran
    solamente enteros positivos? 
    Se cambia Float por Integer:

    public class ValueOfDemo {
    public static void main(String[] args) {

        if (args.length == 2) {
            // Convert strings to integers
            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);

            // do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program requires two command-line arguments.");
        }
    }
}

 */