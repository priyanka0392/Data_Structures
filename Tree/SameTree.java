package Tree;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q== null)
            return true;
    if(p == null || q == null)
        return false;

        return p.data == q.data &&
    isSameTree(p.left,q.left) &&
    isSameTree(p.right, q.right);

    }

    public static void main(String args[]) {
        TreeNode p = new TreeNode(1);
        p.right = new TreeNode(2);
        p.left = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        q.left = new TreeNode(3);

        System.out.println(isSameTree(p,q));
    }
    }

