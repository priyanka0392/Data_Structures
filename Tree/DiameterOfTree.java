package Tree;

public class DiameterOfTree {

    public int diameter(TreeNode root) {
    int[] finalDiam = diamAndHeight(root);

    return finalDiam[1];

    }

    public int[] diamAndHeight(TreeNode root) {
        int[] left = diamAndHeight(root.left);
        int[] right = diamAndHeight(root.right);

        int rootDiam = left[1] + right[1] + 1;
        int leftDiam = left[0];
        int rightDiam = right[0];
        int height = Math.max(left[1],right[1]) + 1;
        int finalDiam = Math.max(rootDiam,Math.max(leftDiam,rightDiam));

        int[] heightAndDiam = {height,finalDiam};
        return heightAndDiam;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(32);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(43);
        treeNode.right.left = new TreeNode(3);


    }
}
