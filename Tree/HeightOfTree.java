package Tree;

public class HeightOfTree {

    public static int height(Node root) {
     if(root == null)
         return 0;

     int leftHeight = height(root.left);
     int rightHeight = height(root.right);

     return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void main(String args[]) {
        Node treeNode = new Node(4);
        treeNode.left = new Node(2);
        treeNode.right = new Node(7);
        treeNode.left.left = new Node(1);
        treeNode.left.right = new Node(3);

        System.out.println(height(treeNode));
    }
}
