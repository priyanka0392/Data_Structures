package BinaryTree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindNodeWithoutRecursion {
    static Queue<TreeNode> queue = new LinkedList<>();
    public static TreeNode findNode(TreeNode root, int val) {
    if(root == null)
        return null;


        queue.add(root);
        for (TreeNode tree : queue) {
            if (tree.val == val)
                return tree;
        }
            if(root.left != null)
                queue.add(root.left);
            else if(root.right != null)
                queue.add(root.right);
    return null;
    }

    public static void main(String args[]) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right = new TreeNode(3);

        System.out.println(findNode(t1,4));
    }
}
