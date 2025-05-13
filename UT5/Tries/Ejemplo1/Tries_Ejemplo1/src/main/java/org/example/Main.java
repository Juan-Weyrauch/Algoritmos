package org.example;
import java.lang.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insertar("casa");
        trie.insertar("casco");
        trie.insertar("canto");


        // Create a character object
        char c = 'a';

        int value = c; // a -> 97 || b -> 98 ...

        System.out.println("Character value of " + c + " is " + value);


        Character charObject = 'A';
        char primitiveChar = charObject.charValue();
        System.out.println("Character object: " + charObject);
        System.out.println("Primitive char value: " + primitiveChar);

        System.out.println(trie.buscar("casa"));      // true
        System.out.println(trie.buscar("cas"));       // false
        System.out.println(trie.empiezaCon("cas"));   // true
        System.out.println(trie.empiezaCon("can"));   // true
        System.out.println(trie.buscar("canto"));     // true
        System.out.println(trie.buscar("cantar"));    // false
        }
    }

