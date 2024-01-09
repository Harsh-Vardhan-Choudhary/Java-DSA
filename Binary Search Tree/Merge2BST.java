import java.util.ArrayList;

public class Merge2BST
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

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data + "\t");
        preorder(root.left);
        preorder(root.right);
    }

    public static void toArraylist(Node root, ArrayList<Integer> inorder)
    {
        if(root == null)
        {
            return;
        }

        toArraylist(root.left, inorder);
        inorder.add(root.data);
        toArraylist(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> finalarr, int st, int end)
    {
        if(st>end)
        {
            return null;
        }

        int mid = (st + end)/2;
        Node root = new Node(finalarr.get(mid));

        root.left = createBST(finalarr, st, mid-1);
        root.right = createBST(finalarr, mid+1, end);
        
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2)
    {
        //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        toArraylist(root1, arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        toArraylist(root2, arr2);

        //merge
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size())
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                finalArr.add(arr1.get(i));
                i++;
            }
            else
            {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        //jab ek arr complete ho gaya ho aur koi bacha ho then

        while(i<arr1.size())
        {
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size())
        {
            finalArr.add(arr2.get(j));
            j++;
        }

        //sorted arraylist to BST
        Node root = createBST(finalArr, 0, finalArr.size()-1);

        return root;
    }
    
    public static void main(String args[])
    {
        /*
                2
               / \
              1   4

            BST1
        */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
                9
               / \
              3   12
            
            BST2    
        */

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
