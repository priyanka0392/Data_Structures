package BinaryTree;

public class CreateABinaryTree {
    public static TreeNode addTreeNode(int arr[],int start, int last) {

        int mid = (last+start)/2;

        TreeNode node = new TreeNode(arr[mid]);
        node.left = addTreeNode(arr,start,mid-1);
        node.right = addTreeNode(arr,mid+1,last);

        return node;
    }
}
