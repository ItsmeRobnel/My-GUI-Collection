
package nodesprac2;


public class InOrder {
 TreeNode root;
   
    public void traverseTree(TreeNode node){
    if(node!=null){
        traverseTree(node.left);
        System.out.print(" " +node.data);
        traverseTree(node.right);
               
    }
}
public static void main(String [] args){
    //first structure long process
    InOrder obj = new InOrder();
    obj.root = new TreeNode("A");
    obj.root.left = new TreeNode("B");
    obj.root.right = new TreeNode("C");
    obj.root.left.right = new TreeNode("D");
    obj.root.right.left = new TreeNode("E");
    obj.root.right.right = new TreeNode("F");
    obj.root.right.left.left = new TreeNode("G");
    obj.root.right.right.left = new TreeNode("H");
    obj.root.right.right.right = new TreeNode("I");
    
    //traversing InOrder
    System.out.print("In order: ");
    obj.traverseTree(obj.root);
    //DBEAFC
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
