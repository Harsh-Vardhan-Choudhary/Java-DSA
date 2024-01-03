import java.util.*;

public class HeightCountSum
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //height of the tree
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    //count of the nodes
    public static int count(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return (lc+rc+1);
    }

    //sum of the nodes
    public static int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ls = sum(root.left);
        int rs = sum(root.right);

        int sum = ls + rs + root.data;
        return sum;
    }

    //diameter of the tree - Approach 1     - O(n^2)
    public static int diameterA1(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ld = diameterA1(root.left);
        int rd = diameterA1(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        int selfd = lh+rh+1;

        return Math.max(selfd, Math.max(ld, rd));
    }

    //diameter of the tree - Approach 2     - O(n)

    static class Info
    {
        int diam;
        int ht;

        public Info(int diam, int ht)
        {
            this.diam = diam;
            this.ht= ht;
        }
    }

    public static Info diameterA2(Node root)
    {
        if(root == null)
        {
            return new Info(0,0);
        }
        Info leftInfo = diameterA2(root.left);
        Info rightInfo = diameterA2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String args[])
    {
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7

        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("The height of tree is : " + height(root));
        System.out.println("Count of Nodes are : " + count(root));
        System.out.println("The sum of each node is : " + sum(root));
        System.out.println("The diameter of the tree by approach 1 is : " + diameterA1(root));
        System.out.println("The diameter of the tree by approach 2 is : " + diameterA2(root).diam);     //diameterA2(root) object return karta
    }
}
