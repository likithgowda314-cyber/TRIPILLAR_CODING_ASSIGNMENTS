package Assignment5.Module14;
class Node1 {
    int data;
    Node1 left, right;

    Node1(int value){
        data = value;
        left = right = null;
    }
}

public class PreorderTraversal {

    Node root;

    void preorder(Node node){
        if(node != null){
            System.out.print(node.data + " "); // Root
            preorder(node.left);  // Left subtree
            preorder(node.right); // Right subtree
        }
    }

    public static void main(String[] args){

        PreorderTraversal tree = new PreorderTraversal();

        // Creating Binary Tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
    }
}