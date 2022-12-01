package nodesprac;

import java.util.*;

public class DIfferentOrders {

    int choice;
    Scanner sc = new Scanner(System.in);
    TreeNode root;

    void menu() {
        do {
            
            System.out.println("\n1]Pre Order\n2]In Order\n3]Post Order  ");
            System.out.print("\nSelect from 1-3:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //traversing PreOrder
                    System.out.print("Pre order result: ");
                    traverseTreePreOrder(root);
                    //PreOrder:  A B D C E G F H I
                    break;
                case 2:
                    //traversing InOrder
                    System.out.print("\nIn order result: ");
                    traverseTreeInOrder(root);
                    //Inorder:  B D A G E C H F I
                    break;
                case 3:
                    //traversing PostOrder
                    System.out.print("\nPost order result: ");
                    traverseTreePostOrder(root);
                    //Postorder:  D B G E H I F C A
                    break;
                case 4:
                    System.out.println("Program Terminated....");
                    System.exit(0);
            }
        } while (choice != 4);
    }

    public void traverseTreeInOrder(TreeNode node) {
        if (node != null) {
            traverseTreeInOrder(node.left);
            System.out.print(" " + node.data);
            traverseTreeInOrder(node.right);

        }
    }

    public void traverseTreePostOrder(TreeNode node) {

        if (node != null) {
            traverseTreePostOrder(node.left);
            traverseTreePostOrder(node.right);
            System.out.print(" " + node.data);

        }
    }

    public void traverseTreePreOrder(TreeNode node) {
        if (node != null) {

            System.out.print(" " + node.data);
            traverseTreePreOrder(node.left);
            traverseTreePreOrder(node.right);

        }
    }

    public static void main(String[] args) {
        //structure of Tree
        DIfferentOrders obj = new DIfferentOrders();
        obj.root = new TreeNode("A");
        obj.root.left = new TreeNode("B");
        obj.root.right = new TreeNode("C");
        obj.root.left.right = new TreeNode("D");
        obj.root.right.left = new TreeNode("E");
        obj.root.right.right = new TreeNode("F");
        obj.root.right.left.left = new TreeNode("G");
        obj.root.right.right.left = new TreeNode("H");
        obj.root.right.right.right = new TreeNode("I");

        obj.menu();

    }
}

class TreeNode {

    TreeNode left;
    TreeNode right;
    String data;

    public TreeNode(String data) {
        this.data = data;
    }
}
