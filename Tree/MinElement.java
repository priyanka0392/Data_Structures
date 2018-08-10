package Tree;

public class MinElement {

    public static TreeNode findMin(TreeNode root) {
        TreeNode left = root;
        while (left.left != null) {
          left   = findMin(root.left);
        }
    return left;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(32);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(43);
        treeNode.right.left = new TreeNode(3);

        findMin(treeNode);
    }
}
