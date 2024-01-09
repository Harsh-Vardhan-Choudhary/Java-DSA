//package Binary Search Tree;

public class BST
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }  

    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        //left subtree
        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }

        //right subtree
        else
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + "\t");
        inorder(root.right);
    }

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        if(root.data > key)
        {
            return search(root.left, key);
        }

        else
        {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val)
    {
        if(root.data < val)
        {
            root.right = delete(root.right, val);
        }

        else if(root.data > val)
        {
            root.left = delete(root.left, val);
        }

        else
        {
            //case1 - leaf node
            if(root.left == null & root.right==null)
            {
                return null;
            }

            //case2 - single child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            //case3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, val);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }

        if(root.data >= k1 && root.data <= k2)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + "\t");
            printInRange(root.right, k1, k2);
        }

        //data lies in left subtree
        else if(root.data < k1)
        {
            printInRange(root.left, k1, k2);
        }

        //data lies in right subtree
        else
        {
            printInRange(root.right, k1, k2);
        }
        
    }
    
    public static void main(String args[])
    {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++)
        {
            root= insert(root, values[i]);
        }
        
        inorder(root);
        System.out.println();

        // if(search(root, 3))
        // {
        //     System.out.println("Found");
        // }
        // else
        // {
        //     System.out.println("Not Found");
        // }

        // root = delete(root, 1);
        // System.out.println();

        // inorder(root);

        printInRange(root, 5, 8);
    }
}
