package Tree;

public class BSTInsertion {

    public static Node insert(Node root,int data) {
        Node parent = null,current = root;
    if(root == null)
        root = new Node(data);

    while(current != null) {
        parent = current;
        if(parent.data > data)
            current = current.left;
        else current = current.right;
    }

    if(parent.data > data)
        parent.left = new Node(data);
    else parent.right = new Node(data);
    return root;
    }

    public static void main(String args[]) {
        Node treeNode = new Node(4);
        treeNode.left = new Node(2);
        treeNode.right = new Node(7);
        treeNode.left.left = new Node(1);
        treeNode.left.right = new Node(3);

        System.out.println(insert(treeNode,6).data);
    }
}
