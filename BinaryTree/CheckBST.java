package BinaryTree;

public class CheckBST {
    public static boolean validateBST(TreeNode root) {

        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public static boolean checkBST(TreeNode root, int min, int max) {
        if(root == null)
            return true;

        if(root.right== null && root.left == null)
            return true;

        if(root.val < min || root.val > max)
            return false;

        return (checkBST(root.left,min,root.val-1) && checkBST(root.right,root.val+1,max));
    }


}
