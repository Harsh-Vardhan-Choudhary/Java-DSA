package ArrayList;

import java.util.ArrayList;

public class MultiDimension_Arraylist
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(9);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(5);
        mainlist.add(list2);
    }
}