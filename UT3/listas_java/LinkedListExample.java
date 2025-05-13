import java.util.ArrayList;
import java.util.LinkedList;

/*
 * SIMILARITIES: 
 *    - They both implement the same interface! (List Interface)
 *    - They are both part of the 'Java Collections Framework'
 *
 * DIFFERENCES:
 *    - BETTER FOR ARRAY LISTS:
 *      - Array Lists have O(n) time when retrieving elements. Doesn't matter the position.
 *      - Linked Lists have to follow the lists path in order to get to the element. 
 *    
 *    - BETTER FOR LINKED LISTS:
 *      - Linked Lists are better at INSERTING or DELETING items.
 *        They just have to change the reference of the previous and next elements.
 *      - ArrayLists have to: Create a new list, import all the existing elements, leave space for the new one, 
 *        and then they can add the new element while deleting the older version of the list. 
 */

public class LinkedListExample {

    public static void main(String[] args) {
      // ----------------------- NORMAL ARRAY -------------------------
        String[] normalArray = new String[4]; // It has a set size, cannot be changed.

      // ----------------------- ARRAY LISTS --------------------------
        ArrayList<String> namesArrayList = new ArrayList<>();
        // ADDING ELEMENTS: 
        namesArrayList.add("Juan");
        namesArrayList.add("Paulina");
        // GETTING ELEMENTS:
        namesArrayList.get(0);
        // ADDING ELEMENTS:
        namesArrayList.add(1, "Guillermina");


      // ----------------------- LINKED LISTS -------------------------
        LinkedList<String> namesLinkedList = new LinkedList<>();
        // ADDING ELEMENTS: 
        namesLinkedList.add("Juan");
        namesLinkedList.add("Paulina");
        // GETTING ELEMENTS:
        namesLinkedList.get(0);
        // ADDING ELEMENTS:
        namesLinkedList.add(1, "Guillermina");

    }
}
