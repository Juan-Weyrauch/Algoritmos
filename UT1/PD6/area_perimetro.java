import java.util.Scanner;

public class area_perimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio: ");
        int radio = scanner.nextInt();
        calcular(radio);

        scanner.close();

    }

    public static void calcular(int radio){
        System.out.println("Radio: " + radio*radio*3.14);
        System.out.println("Perimetro: " + 2*radio*3.14);
    }
}
