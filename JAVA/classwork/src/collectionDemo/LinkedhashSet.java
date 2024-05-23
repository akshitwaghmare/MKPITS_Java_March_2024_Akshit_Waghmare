package collectionDemo;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;

public class LinkedhashSet {
    public static void main(String[] args) {
        // linkedhashset uses linkedhashmap
        // performance is down.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(21);
        linkedHashSet.add(22);
        linkedHashSet.add(23);
        linkedHashSet.add(24);
        System.out.println(linkedHashSet);
        // hashset uses hash map
        //hashset is faster
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(21);
        hashSet.add(22);
        hashSet.add(23);
        hashSet.add(34);
        hashSet.add(24);
        hashSet.add(25);
        System.out.println(hashSet);


    }
}
