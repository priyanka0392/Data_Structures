package Tree;

public class MaxElementBST {
    TreeNode node = new TreeNode(0);
    public  TreeNode findMax(TreeNode root) {
    if(root == null)
        return null;

    if(root.left ==null && root.right==null)
        return root;

     if (root != null) {
         node = findMax(root.right);
     }

      return node;

    }

    public static void main(String args[]) {
        MaxElementBST  maxElementBST =new MaxElementBST();
        TreeNode treeNode = new TreeNode(4);
        treeNode.right = new TreeNode(8);
        treeNode.left = new TreeNode(2);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(10);
        System.out.println(maxElementBST.findMax(treeNode).data);
    }
}
