package binaryTree;

/**
 * Created by PDeb on 12/30/2017.
 */
public class CheckIfBinaryTreeIsHeightBalanced {

    public boolean isHeightBalanced(Node root){
        Boolean isBalanced = false;
        isHeightBalanced(root, isBalanced);
        return isBalanced;
    }

    private int isHeightBalanced(Node root, Boolean isBalanced) {
        if(root == null)
            return 0;

        int leftHeight = isHeightBalanced(root, isBalanced);
        int rightHeight = isHeightBalanced(root, isBalanced);

        if(Math.abs(leftHeight-rightHeight) > 1)
            isBalanced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
