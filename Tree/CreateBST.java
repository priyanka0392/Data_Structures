package Tree;

public class CreateBST {

    public static TreeNode createBST(int a[], int start, int last) {

            if(start<last)
                return null;
            int mid = (start + last) / 2;

           TreeNode root = new TreeNode(a[mid]);

            root.left = createBST(a,start,mid-1);
            root.right = createBST(a,mid+1,last);


        return root;

    }

    public static void main(String args[]) {
        int a[] = {5,8,10,15,20,24,27,31,35};
        createBST(a,0,a.length-1);
    }
}
