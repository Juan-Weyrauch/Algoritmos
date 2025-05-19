class Node {
  int data;
  Node next; //Null (node) till changed.
  Node prev;
  double id;

  public Node (int data, Node prev) {
    this.data = data;
    this.prev = prev;
    this.id = (int) (Math.random() * (10 - 1) + 1);
  }

}


class LinkedList {
  Node head;

  public LinkedList (Node head) {
    this.head = head;
  }

  public Append (LinkedList passedList) {
    
  }

}
