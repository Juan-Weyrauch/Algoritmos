import java.util.Scanner;

public class Tablero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo: ");
        int ancho = scanner.nextInt();

        imprimirTablero(ancho);

        scanner.close();
    }

    public static void imprimirTablero(int ancho){
        for (int i = 0; i < ancho; i++){
            for (int j = 0; j < ancho; j++){
                // asi no imprime un " " al final.
                if (i == ancho) {
                    System.out.print("#");
                }
                else{
                System.out.print("#");
                System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}