package binaryTree;

/**
 * Created by PDeb on 12/28/2017.
 */
public class CheckIfBinaryTreeIsSumTree {

    int isSumTree(Node root){
        if(root==null)
            return 0;

        if(root.left == null && root.right == null)
            return root.key;

        if(root.key == isSumTree(root.left)+isSumTree(root.right))
            return 2*root.key;

        return Integer.MIN_VALUE;
    }
}
