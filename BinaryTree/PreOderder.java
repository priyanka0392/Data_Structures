package BinaryTree;

import java.util.ArrayList;

public class PreOderder {
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();
    public void preorder(TreeNode root) {
    if (root == null)
        return;

    preorderedList.add(root.val);
    if(root.left != null)
    preorder(root.left);
    if(root.right != null)
    preorder(root.right);

    for (Integer i : preorderedList) {
        System.out.println(i);
    }
    }

    public static void main(String args[]) {
        PreOderder p =new PreOderder();
        TreeNode t2 = new TreeNode(5);
        t2.left = new TreeNode(3);
        t2.left.left = new TreeNode(2);
        t2.right = new TreeNode(6);
        t2.right.left = new TreeNode(1);
        t2.right.right = new TreeNode(4);

        p.preorder(t2);
    }
}
