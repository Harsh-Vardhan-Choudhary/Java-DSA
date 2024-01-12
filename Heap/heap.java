package Heap;

import java.util.*;

public class heap 
{
    static class HEAP
    {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data)   //O(logn)
        {
            arr.add(data);

            int x = arr.size()-1;   //x is child index
            int par = (x-1)/2;    // parent index

            while(arr.get(x) < arr.get(par))    //worst case will be that the element has to travel toh entire height of tree, that means - H = logn | O(logn)
            {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        

    }
}
