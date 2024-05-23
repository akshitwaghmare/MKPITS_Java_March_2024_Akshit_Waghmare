package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        set.add(25);

        Set<Integer> set1 = new HashSet<>();
        set1.add(31);
        set1.add(32);
        set1.add(33);
        set1.add(24);
        set1.add(25);
        //UNION
        Set<Integer> set2 = new HashSet<>(set1);
        set2.addAll(set);
        System.out.println(set2);
        //INTERSECTION
        Set<Integer> set3 = new HashSet<>(set1);
        set3.retainAll(set);
        System.out.println(set3);
        //REMOVE DUPLICATES FROM ONE SET TO ANOTHER(DIFFERENCE)
        set.removeAll(set1);
        System.out.println(set);
    }
}
