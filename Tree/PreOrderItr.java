package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderItr {

    public static ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<TreeNode> stackNode = new Stack<>();
        stackNode.push(root);
        while(!stackNode.empty()) {
            TreeNode curr = stackNode.peek();
            list.add(stackNode.pop().data);

            if(curr.right != null) {
                stackNode.push(curr.right);

            }
            if(curr.left != null) {
                stackNode.push(curr.left);

            }
        }
        return list;

    }

    public static void main(String args[]) {
      TreeNode treeNode = new TreeNode(10);
      treeNode.left = new TreeNode(32);
      treeNode.right = new TreeNode(5);
      treeNode.right.right = new TreeNode(43);
      treeNode.right.left = new TreeNode(3);

      preorderItr(treeNode);

    }
}
