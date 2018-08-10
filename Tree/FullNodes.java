package Tree;

import java.util.Stack;

public class FullNodes {

    public int numberOfFullNodes(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        int count = 0;
        while (!treeNodeStack.empty()) {
            TreeNode treeNode = treeNodeStack.pop();
            if(treeNode.right != null && treeNode.left != null)
                count++;

            if(treeNode.right != null)
                treeNodeStack.push(treeNode.right);

            if(treeNode.left != null)
                treeNodeStack.push(treeNode.left);
        }

        return count;
    }
}
