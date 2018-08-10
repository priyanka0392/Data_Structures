package BinaryTree;

public class SumOfNodes {
    public static int sum(TreeNode root) {

    if(root == null)
        return 0;
    int left = sum(root.left);
    int right = sum(root.right);
    return root.val+left+right;
    }

    public static void main(String args[]) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right = new TreeNode(3);
        System.out.println(sum(t1));
    }
}
