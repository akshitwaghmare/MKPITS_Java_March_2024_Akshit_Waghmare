package collectionDemo;

import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        // treeset uses treemap internally
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(25);
        treeSet.add(29);
        treeSet.add(45);
        treeSet.add(1);
        treeSet.add(9);
        System.out.println(treeSet);
    }
}
