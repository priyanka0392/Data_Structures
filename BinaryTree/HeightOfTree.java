package BinaryTree;

public class HeightOfTree {
    public static int findHeight(TreeNode root) {
    if(root == null)
        return 0;

    int left = findHeight(root.left)+1;
    int right = findHeight(root.right)+1;

    return left>right ? left : right;

    }

    public static void main(String args[]) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right = new TreeNode(3);
        System.out.println(findHeight(t1));
    }
}
