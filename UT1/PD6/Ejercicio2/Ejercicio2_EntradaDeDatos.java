import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ejercicio2_EntradaDeDatos {
    public static void main(String[] args) {
        try {
            // Crear un objeto File que representa el archivo a leer
            File archivo = new File("./PD6/Ejercicio2/entrada.txt");
            
            // Crear un Scanner para leer el archivo
            Scanner lector = new Scanner(archivo);
            
            // Leer los datos del archivo
            int entero = lector.nextInt();
            double flotante = lector.nextDouble();
            String cadena = lector.next();
            
            // Cerrar el Scanner
            lector.close();
            
            // Calcular la suma
            double suma = entero + flotante;
            
            // Calcular la división entera y el resto
            int divisionEntera = (int)(flotante / entero);
            double resto = flotante % entero;
            
            // Imprimir los resultados
            System.out.println("El entero leído es: " + entero);
            System.out.println("El número de punto flotante es: " + flotante);
            System.out.println("La cadena leída es \"" + cadena + "\"");
            System.out.println("¡Hola " + cadena + "! La suma de " + entero + " y " + flotante + " es " + suma + ".");
            System.out.println("La división entera de " + flotante + " y " + entero + " es " + divisionEntera + " y su resto es " + resto + ".");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el archivo entrada.txt");
            e.printStackTrace();
        }
    }
}
