package Tree;

public class BalancedBinaryTree {

    public static boolean balanceTree(TreeNode root) {
        if(root == null)
            return true;

        if(root.right == null && root.left == null)
            return true;

        int diff = checkHeight(root);
        return diff == 0 || diff ==1 || diff == -1?true : false;
    }

    public static int checkHeight(TreeNode root) {

        if(root == null)
            return 0;
        int leftHt = checkHeight(root.left);
        int rightHt = checkHeight(root.right);
        System.out.println(leftHt + " " +rightHt);
        int diff = leftHt - rightHt;
        System.out.println(diff);
        return diff;

    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(32);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(43);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.left.right = new TreeNode(34);

        System.out.println(balanceTree(treeNode));
    }
}
