package BinaryTree;

import java.util.Stack;


public class SearchNode {

   TreeNode root;

    public static TreeNode findNode(TreeNode root, int val) {

        if(root == null)
            return null;
        Stack<TreeNode> s = new Stack();
        if (root.val == val)
            return root;
        while (root != null) {
            s.push(root);
            root = root.left;
            if(root!=null) {
                if (root.val == val)
                    return root;
            }
        }


        while (s.size() > 0) {
            root = s.pop();
            while (root.right != null) {
                root = root.right;

                if(root!=null) {
                    if (root.val == val)
                        return root;
                }

                if (root!= null) {
                    s.push(root);
                    if(root.left != null)
                    root = root.left;
                    if(root!=null) {
                        if (root.val == val)
                            return root;
                    }


                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        SearchNode tree = new SearchNode();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println(findNode(tree.root,2).val);
    }
}
