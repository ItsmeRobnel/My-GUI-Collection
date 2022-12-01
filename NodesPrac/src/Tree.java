public class Tree {
 TreeNode root;
    public void createBinaryTree() {
            TreeNode first = new TreeNode(1);
            TreeNode second = new TreeNode(2);
            TreeNode third = new TreeNode(3);
            TreeNode fourth = new TreeNode(4);
            TreeNode fifth = new TreeNode(5);

            root = first;
            first.left = second;
            first.right = third;

            second.left = fourth;
            second.right = fifth;

        }
   
    public void traverseTree(TreeNode node){
    if(node!=null){
        traverseTree(node.left);
        System.out.println(" " +node.data);
        traverseTree(node.right);
               
    }
}
public static void main(String [] args){
    //first structure long process
    Tree obj = new Tree();   
    //Second structure Short Process
    obj.createBinaryTree();
    //traversing
    obj.traverseTree(obj.root);
}
}
 class TreeNode {

        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
        }
 }