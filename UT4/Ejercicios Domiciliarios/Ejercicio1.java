public class Node {
  String operator; // Can be anything. Operator, variable, number.
  Node left;
  Node right;

  public Node (String op) {
    this.operator = op;
  }

  public Node (String op, Node left, Node right) {
    this.operator = op;
    this.left = left;
    this.right = right;
  }
}


public class BinaryTree {
 private Node root = new TNode();

  public BinaryTree () {
    this.root = null;
  }

  public void Insert(String op) {
    root = InsertRecursive(root, op);
  }

  public Node InsertRecursive(Node root, String op) {
    // If the tree is empty, return a new Node
    if (root == null) {
      root = new Node(op);
      return root;
    }

    //Else, recurr down the tree
    if (op < root) {
      root.left = InsertRecursive(root.left, op);
    }
    else if (op > root) {
      root.right = InsertRecursive(root.right, op);
    }

    // ret the (unchanged) node pointer.
    return root;
  }

  public double Substitute (double first, String op, double second) {
    if ()
  }

}


public class Ejercicio1 {
  public static void main(String[] args) {

  }
}
