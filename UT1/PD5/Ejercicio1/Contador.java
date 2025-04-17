package PD5.Ejercicio1;

public class Contador {
    public static void main(String[] args) {
        String frase = "Hola mundo!";
        int vocales = 0;
        int consonantes = 0;

        for (char c : frase.toCharArray()) {
            TipoCaracter tipo = Clasificador.clasificar(c);
            switch (tipo) {
                case VOCAL:
                    vocales++;
                    break;
                case CONSONANTE:
                    consonantes++;
                    break;
                default:
                    // Ignorar otros caracteres
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}
