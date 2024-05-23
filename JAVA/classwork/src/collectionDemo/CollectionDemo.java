package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList <Integer>arrayList = new ArrayList<Integer>();
//        arrayList.add("akshit");
//        arrayList.add("adarsh");
        arrayList.add(89);
        System.out.println(arrayList.toArray());
        System.out.println(arrayList.get(2));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(32);
        //linkedList.add("akshit");
        linkedList.addLast(23);
        linkedList.add(25);
        System.out.println(linkedList);


    }
}
