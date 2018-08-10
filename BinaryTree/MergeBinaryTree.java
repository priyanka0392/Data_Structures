package BinaryTree;

public class MergeBinaryTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null)
            return t2;

        if(t2 == null)
            return t1;

        t1.val = t1.val+t2.val;

        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);

        print(t1);
        return t1;
    }

    public void print(TreeNode node) {
        if (node == null)
            return;

        /* first recur on left child */
        print(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        print(node.right);
    }
    public static void main(String args[]) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(5);
        t2.left = new TreeNode(3);
        t2.left.left = new TreeNode(2);
        t2.right = new TreeNode(6);
        t2.right.left = new TreeNode(1);
        t2.right.right = new TreeNode(4);

        MergeBinaryTree mergeBinaryTree = new MergeBinaryTree();
        mergeBinaryTree.mergeTrees(t1,t2);

    }
}
