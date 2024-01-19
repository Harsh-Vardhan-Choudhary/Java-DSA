package Heap;

import java.util.*;

public class heap 
{
    static class HEAP
    {
        ArrayList<Integer> arr = new ArrayList<>();

        //insert in heap
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

                x = par;
                par = (x-1)/2;
            }
        }

        //peek in heap
        public int peek()
        {
            return arr.get(0);
        }

        //heapify is a private function
        private void heapify(int i)
        {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left))
            {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right))
            {
                minIdx = right;
            }

            if(minIdx != i)
            {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp); 

                heapify(minIdx);
            }
        }

        //delete in heap
        public int remove()
        {
            int data = arr.get(0);

            //step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;
        }

        //heap is empty
        public boolean isEmpty()
        {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args)
    {
        HEAP h = new HEAP();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty())
        {
            System.out.print(h.peek());
            h.remove();
        }
    }
}
