package binaryTree;

/**
 * Created by PDeb on 12/28/2017.
 */
public class ConvertBinaryTreeToSumTree {

    public int convertToSum(Node root)
    {
        if(root == null)
            return 0;
        int left = convertToSum(root.left);
        int right = convertToSum(root.right);

        int temp = root.data;
        root.data = left+right;
        return left+right+temp;
    }

    class Node{
        int data;
        Node left, right;
    }

    public int convert(Node root)
    {
        if (root == null)
            return 0;

        int left = convertToSum(root.left);
        int right = convertToSum(root.right);

        int temp = root.data;
        root.data = left + right;
        return root.data + temp;
    }
}
