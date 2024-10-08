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
    public boolean isBalanced(Node root){
        int lh;

        int rh;

        if (node == null) {
            return true;
        }

        lh = height(node.left);
        rh = height(node.right);

        if (Math.Abs(lh - rh) <= 1 && isBalanced(node.left)
            && isBalanced(node.right)) {
            return true;
        }

        return false;
    }
    public int height(Node nd){
        if(nd == null){
            return 0;
        }
        return 1 + Math.Max(height(nd.left),height(nd.right));
    }
}
