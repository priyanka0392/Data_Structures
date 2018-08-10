package Tree;

import java.util.ArrayList;
import java.util.List;

public class SumRootLeaf {
    int sol;
    public int sumNumbers(TreeNode root) {
        sol=0;
        sumNumbersUtil(root, 0);
        return sol;
    }
    public void sumNumbersUtil(TreeNode node, int n) {
        if(node==null)
            return;
        if(node.left==null && node.right==null) {
            sol += n*10+node.data;
        }
        n = n*10+node.data;
        sumNumbersUtil(node.left, n);
        sumNumbersUtil(node.right, n);
    }

    //            1
//            / \
//           3  5
//              /  \
//              3    4
    public void PrintAllPossiblePath(TreeNode node,List<TreeNode> nodelist)
    {
        if(node != null)
        {
            nodelist.add(node);
            //System.out.println(node.data);
            if(node.left != null)
            {
                PrintAllPossiblePath(node.left,nodelist);
            }
            if(node.right != null)
            {
                PrintAllPossiblePath(node.right,nodelist);
            }
            else if(node.left == null && node.right == null)
            {

                for(int i=0;i<nodelist.size();i++)
                {
                    System.out.print(nodelist.get(i).data);
                }
                System.out.println();
            }
            nodelist.remove(node);
        }
    }
    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);

        SumRootLeaf sumRootLeaf = new SumRootLeaf();
       // System.out.println(sumRootLeaf.sumNumbers(treeNode));
        List<TreeNode> nodelist = new ArrayList<TreeNode>();
        sumRootLeaf.PrintAllPossiblePath(treeNode,nodelist);
    }
}



//13+153+154