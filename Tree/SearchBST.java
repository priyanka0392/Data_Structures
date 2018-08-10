package Tree;

public class SearchBST {
    public static TreeNode searchBST(TreeNode root, int val) {
    if(root == null)
        return null;
    TreeNode temp = new TreeNode(0);
    if(root.data == val)
        return root;

    if(val > root.data)
        temp = searchBST(root.right,val);

    else if(val < root.data)
        temp = searchBST(root.left,val);

    return temp;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        System.out.println(searchBST(treeNode,2).data);
    }
}
