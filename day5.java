public class Node {
    Node left;
    int val;
    Node right;

    public int min(Node root){
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr.val;
    }

    public int max(Node root){
        Node curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        return curr.val;
    }
}
