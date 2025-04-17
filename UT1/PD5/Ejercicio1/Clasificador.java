package PD5.Ejercicio1;

public class Clasificador {

    public static TipoCaracter clasificar(char c) { //primera vez que uso 'char'
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) >= 0) { // si 'c' esta en "aeiou" (al usar 'indexOf' puedo poner >= 0, porque si esta siempre va a ser >= 0, y si no tira -1)
            return TipoCaracter.VOCAL;
        } else if (Character.isLetter(c)) {
            return TipoCaracter.CONSONANTE;
        } else {
            return TipoCaracter.OTRO;
        }
    }
}
