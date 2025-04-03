public class Alumno {

    private String nombre;

    public Alumno (){
        nombre = null; 
    }

    public String getNombreAdmiracion(){
        return nombre.concat("!");
    }

    public static void main (String[] args){
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
    }

    public static int recorrer (String cadena) {
        int res = 0;
    for (int i = 1; i <= cadena.length(); i++) {
        if (cadena.charAt(i) != ' ') 
        {res++;}
    }
     return res;
    }
        
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        int idx = 8;
        return vector[idx];
    }
    
    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        return (string[1].charAt(1));
    }
    
    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        return (String) (x1) ;
    }
        
}

//a) Indicar el error al ejecutar la clase Alumno y corregirlo. ¿cómo lo detectaste?
// - Error: 
// 'nombre' es nulo, y al intentar concatenar un nulo con '!' se produce error.
// Al correr el programa salta la excepción NullPointerException
// - Solucion:
// Inicializar la variable nombre -> 'nombre = ""; '
// public Alumno() {
//     nombre = "";  
// }

// b) Indicar el error al ejecutar el método “recorrer” y corregirlo. ¿cómo lo detectaste?
// - Error:
// El bucle for comienza desde i = 1, pero los índices en Java empiezan desde 0.
// Esto provoca 'StringIndexOutOfBoundsException' en cadena.charAt(i).
// - Solución:
// Corregir el índice para que inicie desde 0 y llegue hasta cadena.length() - 1
// public static int recorrer(String cadena) {
//     int res = 0;
//     for (int i = 0; i < cadena.length(); i++) {  // Índices desde 0 hasta length()-1
//         if (cadena.charAt(i) != ' ') {
//             res++;
//         }
//     }
//     return res;
// }


// Indicar el error al ejecutar el método “getValor” y corregirlo. ¿cómo lo detectaste?
// - Error:
// El índice idx = 8 está fuera del rango del arreglo vector, ya que tiene solo 8 elementos (índices de 0 a 7). 
// Esto genera un 'ArrayIndexOutOfBoundsException'
// - Solución:
// Modificar el índice para que esté dentro del rango.
// public static int getValor() {
//     int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
//     int idx = 7;  // Última posición válida en el array
//     return vector[idx];
// }
// - Deteccion: 
// Salio el error al ejecutar el programa, al ser el unico array del programa fue logico lo que habia que hacer.

//Indicar el error al ejecutar el método “getPrimerCaracter” y corregirlo. ¿cómo lo detectaste?
// - Error:
// 'NullPointerException' lo que indica que los elementos de la variable 'string' no estan inicializados. 
// - Solucion:
// Inicializar los elementos del array.
// public static char getPrimerCaracter(String palabra) {
//     String string[] = new String[5];
//     string[1] = palabra;  // Inicializar 
//     return (string[1].charAt(1)); // Acceder
// }
// - Deteccion:
// al llamar al metodo salta el error 'NullPointerException'.

// e) Indicar el error al ejecutar el método “paraAString” y corregirlo. ¿cómo lo detectaste?
// - Error:
// Se está intentando hacer un cast de un Integer a String, lo cual genera un ClassCastException
// - Solución:
// Usar String.valueOf() ~~~ Informacion sacada de google
//public static String paraAString(int a) {
//     return String.valueOf(a);  // Convierte el entero a String correctamente
// }
// - Deteccion:
// El método lanza ClassCastException.


