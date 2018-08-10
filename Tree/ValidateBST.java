package Tree;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {

        if(root == null)
            return true;
        else
        return isValidBST(root,Integer.MIN_VALUE,root.data);
    }

    public static boolean isValidBST(TreeNode root, int min, int data) {

        if(root == null)
            return true;
        int max = Integer.MAX_VALUE;

        if(min > root.data || root.data > max)
            return false;

        return isValidBST(root.left,min,root.data) && isValidBST(root.right,root.data,max);
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);
        System.out.println(isValidBST(treeNode));
    }
}
