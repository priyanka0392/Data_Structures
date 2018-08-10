package Tree;

import java.util.Stack;

public class MaxElementIter {

    public int findMaxItr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = root.data;

        while (!stack.empty()) {
            TreeNode treeNode = stack.pop();
            if(max < treeNode.data) {
                max = treeNode.data;
            }

            if(treeNode.right != null)
                stack.push(treeNode.right);

            if(treeNode.left != null)
                stack.push(treeNode.left);
        }

        return max;
    }
}
