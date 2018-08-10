package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeMode {
    List<Integer> list = new ArrayList<>();
    int[] arr = new int[list.size()];
    public  int[] findMode(TreeNode root) {
        int i=0;
        if(root == null)
            return null;
        if (root != null) {
            list.add(root.data);
            if(list.contains(root.data)) {
                arr[i] = root.data;
            }
            findMode(root.left);
            findMode(root.right);
        }
        return arr;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);

        TreeMode treeMode = new TreeMode();
        int a[] = treeMode.findMode(treeNode);
        for(int i=0 ; i<a.length ; i++)
        System.out.println(a[i]);
    }
}
