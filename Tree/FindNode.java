package Tree;

import java.util.Stack;

public class FindNode {
    public static TreeNode findNode(TreeNode root, int val) {
        if(root.data == val)
            return root;
        Stack<TreeNode> tempStack = new Stack<>();
        tempStack.push(root);
        while (!tempStack.empty()) {
        TreeNode temp = tempStack.peek();
        tempStack.pop();
        if(temp.data == val)
            return temp;

        if(temp.right != null)
            tempStack.push(temp.right);
        if(temp.left != null)
            tempStack.push(temp.left);
        }

        return null;
    }
    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(32);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(43);
        treeNode.right.left = new TreeNode(3);

        System.out.println(findNode(treeNode,3));
    }
}
