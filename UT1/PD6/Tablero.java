import java.util.Scanner;

public class Tablero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo: ");
        int ancho = scanner.nextInt();
        System.out.print("Ingrese el ancho: ");
        int largo = scanner.nextInt();

        imprimirTablero(largo, ancho);

        scanner.close();
    }

    public static void imprimirTablero(int largo, int ancho){
        for (int i = 0; i < largo; i++){
            for (int j = 0; j < ancho; j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}


