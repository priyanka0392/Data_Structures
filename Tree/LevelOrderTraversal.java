package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = null;
    public List<List<Integer>> levelOrder(TreeNode root) {
    if(root == null)
        return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(root);
        queue.add(null);

    while (!queue.isEmpty()) {
        TreeNode curr = queue.poll();
        if(curr == null) {
            if (!queue.isEmpty()) {
                lists.add(list);
                list = new ArrayList<>();
            }
            else {
                list.add(curr.data);
                if (curr.left != null)
                    levelOrder(curr.left);

                if (curr.right != null)
                    levelOrder(curr.right);
            }
        }

    }

    return lists;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);

        LevelOrderTraversal l = new LevelOrderTraversal();
        l.levelOrder(treeNode);
    }
}
