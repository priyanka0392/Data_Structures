package Tree;

import java.util.TreeMap;

public class MaxElement {

    public static int findMax(TreeNode root) {
    int left,right;
    int head = root.data;
    left = findMax(root.left);
    right = findMax(root.right);


    return Math.max(head,Math.max(left,right));
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(32);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(43);
        treeNode.right.left = new TreeNode(3);
        findMax(treeNode);
    }
}
