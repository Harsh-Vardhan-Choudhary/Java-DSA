package Hashmap;

import java.util.HashSet;

public class CountDistinctElement
{
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,2,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++)
        {
            set.add(num[i]);
        }
        System.out.println("ans : " + set.size());
    }    
}
