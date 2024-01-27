package Hashmap;

import java.util.*;

public class HashSet_LinkedHashSet_TreeHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Banglore");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Mumbai");
        lhs.add("Banglore");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Banglore");
        System.out.println(ts);
    }    
}
