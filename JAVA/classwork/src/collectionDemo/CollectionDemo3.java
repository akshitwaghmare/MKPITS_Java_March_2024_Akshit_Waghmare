package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<Integer>();
        set.add(32);
        set.add(33);
        set.add(34);
//        for(Integer i : set){
//            System.out.println(i);
//        }
        HashSet <Integer> hashSet = new HashSet<Integer>();
        hashSet.add(35);
        hashSet.add(36);
        hashSet.add(37);
//        for (Integer j : hashSet){
//            System.out.println(j);
//        }
        hashSet.forEach(System.out::println);

    }
}
