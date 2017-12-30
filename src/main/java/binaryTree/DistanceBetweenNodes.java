package binaryTree;

/**
 * Created by PDeb on 12/30/2017.
 */
public class DistanceBetweenNodes {

    public int findDistance(Node root, Node x, Node y)
    {
        Node lca = null;
        if(isPresent(root, x) && isPresent(root, y))
            lca = findLCA(root, x, y);
        else
            return Integer.MIN_VALUE;

        return findLevel(lca, x, 0) + findLevel(lca, y, 0);
    }

    private boolean isPresent(Node root, Node nodeValue)
    {
        if(root == null)
            return false;

        if(root.key == nodeValue.key)
            return true;

        return (isPresent(root.left, nodeValue) || isPresent(root.right, nodeValue));
    }

    public Node findLCA(Node root, Node x, Node y){
        if(root == null)
            return null;

        if(root.key == x.key || root.key == y.key)
            return root;

        Node left = findLCA(root.left, x, y);
        Node right = findLCA(root.right, x, y);

        if(left!=null && right!=null)
            return root;

        if(left!=null)
            return left;
        if(right!=null)
            return right;

        return null;
    }

    public int findLevel(Node root, Node x, Integer level){
        if(root == null)
            return Integer.MIN_VALUE;
        if(root.key == x.key)
            return level;
        int left = findLevel(root.left, x, level+1);
        if(left != Integer.MIN_VALUE)
            return left;
        return findLevel(root.right, x, level+1);
    }
}
