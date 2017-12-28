package binaryTree;

/**
 * Created by PDeb on 12/28/2017.
 */
public class FindLCAofANode {

    //Can also be done by checking the value of the root and moving either left or right.
    //Also ensure to check first if the given values exist in the tree by doing a preorder
    Node lca;
    public boolean findLCA(Node root, int x, int y){
        if(root == null)
            return false;
        if(root.key == x || root.key == y){
            lca = root;
            return true;
        }

        boolean left = findLCA(root.left, x, y);
        boolean right = findLCA(root.right, x, y);

        if(left && right){
            lca = root;
            return true;
        }
        return left || right;
    }
}
