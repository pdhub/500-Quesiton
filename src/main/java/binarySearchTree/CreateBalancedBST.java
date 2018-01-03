package binarySearchTree;

import binaryTree.Node;

/**
 * Created by PDeb on 1/1/2018.
 */
public class CreateBalancedBST
{
    public void convert(int[] keys, int low, int high, Node root)
    {
        if (low > high)
            return;

        int mid = (low + high) / 2;
        root = new Node();
        root.key = keys[mid];

        convert(keys, low, mid - 1, root);
        convert(keys, mid + 1, high, root);
    }
}