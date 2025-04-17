package PD5.Ejercicio1;

public class EjemploEnum {

    // Enum
    enum Dia{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        // devuelve todos los valores del enum
        for (Dia dia : Dia.values()) {
            System.out.println("Día: " + dia);
        }
    }
}
