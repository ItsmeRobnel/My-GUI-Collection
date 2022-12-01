
import java.util.Scanner;

class Node {

    int data;
    Node left, right;
    
}

public class BST {

    Node ptr;
    int val;
    Scanner sc = new Scanner(System.in);
    private Node root;

    public BST() {
        root = null;
    }

    public void menu() {
        int input;
        do {
            System.out.println("\n<======= MENU =======> ");
            System.out.println("1]Insert A Node \n2]Traverse \n3]Search \n4]Delete a Node \n5]Exit");
            System.out.print("Choose number [1-3]: ");
            input = sc.nextInt();

            switch (input) {

                case 1:
                    insertMethod();
                    break;
                case 2:
                    if (ptr == null) {
                        System.out.println("Binary Tree is Empty! Input Node first.");
                    } else {
                        System.out.println("\nDISPLAYING THE NODES ");
                        traverse();

                    }
                    break;
                case 3:
                    System.out.print("Enter a Node to search: ");
                    int nodeToSearch = sc.nextInt();
                    if(search(nodeToSearch)==true){
                        System.out.println("Node "+nodeToSearch+" FOUND!");
                    }else{
                        System.out.println("Node "+nodeToSearch+" NOT FOUND!");
                    }
                    break;
                case 4:
                    System.out.print("Enter a Node you want to Delete: ");
                    int NodeToBeDeleted = sc.nextInt();
                   deleteNode_recur(this.root, NodeToBeDeleted);
                    break;
                case 5:
                    System.out.println("Program Terminated.....");
                    System.exit(0);
                    break;
            }
        } while (input != 5);
    }

    public void insertMethod() {
        Node temp;

        System.out.println("Enter a Node to be Inserted: ");
        val = sc.nextInt();
        temp = new Node();
        temp.data = val;
        temp.left = null;
        temp.right = null;
        if (root == null) {
            root = temp;
        } else {
            ptr = root;
            while (ptr != null) {
                if (val > ptr.data) {
                    if (ptr.right == null) {
                        ptr.right = temp;
                        break;
                    } else {
                        ptr = ptr.right;
                    }
                } else if (val < ptr.data) {
                    if (ptr.left == null) {
                        ptr.left = temp;
                        break;
                    } else {
                        ptr = ptr.left;
                    }
                } else {
                    System.out.println("Duplicate value not allowed");
                    break;
                }
            }
        }
    }

    
// method for search the data , is data is present or not in the tree ?
    public boolean search(int data) {
        return search(this.root, data);
        
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }
    
 
   public Node deleteNode_recur(Node node, int value){
  if(node == null)
    return null;
  if(value < node.data){
    node.left = deleteNode_recur(node.left, value);
  }else if (value > node.data){
    node.right = deleteNode_recur(node.right, value);
  }else{
    // Leaf node deletion case
    if(node.left == null && node.right == null){
      System.out.println("Leaf node deletion case");
      node = null;
    }
    // Node to be deleted has one child case
    // Node to be deleted has right child
    else if(node.left == null){
      System.out.println("Having One right child deletion case");
      node = node.right;
    }
    // Node to be deleted has left child
    else if(node.right == null){
      System.out.println("Having One left child deletion case");
      node = node.left;
    }
    // Node to be deleted has two children case
    else{
      System.out.println("Two children deletion case");
      Node successor = findSuccessor_recur(node.right);
      // Copy the value
      node.data = successor.data;
      // delete successor node instead
      node.right = deleteNode_recur(node.right, successor.data);
    }
  }
  return node;
}
private Node findSuccessor_recur(Node node){
  if(node.left == null)
    return node;
  else 
    return findSuccessor_recur(node.left);  
}
    
public void preorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        System.out.print("\t" + ptr.data);
        preorder(ptr.left);
        preorder(ptr.right);
    }

    public void inorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        inorder(ptr.left);
        System.out.print("\t" + ptr.data);

        inorder(ptr.right);
    }

    public void postorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        postorder(ptr.left);
        postorder(ptr.right);
        System.out.print("\t" + ptr.data);

    }

    public void traverse() {
        System.out.println("\nPreorder Traversal ");
        preorder(root);
        System.out.println("\nInorder Traversal ");
        inorder(root);
        System.out.println("\nPostorder Traversal ");
        postorder(root);

    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.menu();

    }

}
