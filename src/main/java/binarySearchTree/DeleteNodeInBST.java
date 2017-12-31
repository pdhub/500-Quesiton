package binarySearchTree;

import binaryTree.Node;

/**
 * Created by PDeb on 12/31/2017.
 */
public class DeleteNodeInBST
{
    public void delete(Node root, int key)
    {
        Node parent = null;
        Node curr = root;

        //Sets parent of node to be deleted
        search(curr, key, parent);

        //if key not found, return
        if(curr == null)
            return;

        //if node to delete is leaf
        if(curr.left == null && curr.right == null)
        {
            if (parent.left == curr)
                parent.left = null;
            else
                parent.right = null;
        }
        //its not a leaf
        else if(curr.left != null && curr.right !=null)
        {
            Node succesor = minimumKey(curr.right);
            int val = succesor.key;
            delete(root, val);//recursively delete
            curr.key = val;
        }
        //if one node
        else
        {
            Node child = root.left == null ? root.right : root.left;
            //If node to be deleted is not a root node
            if(curr != root)
            {
                if(curr == parent.left)
                    parent.left = child;
                else
                    parent.right = child;
            }
            else
                root = child;
        }
    }

    private void search(Node curr, int key, Node parent)
    {
        while (curr !=null && curr.key != key)
        {
            parent = curr;
            if(curr.key < key)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }


    private Node minimumKey(Node node)
    {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
