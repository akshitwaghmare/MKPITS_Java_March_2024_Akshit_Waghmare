package collectionDemo;

import java.util.*;

public class CollectionDemo5 {
    public static void main(String[] args) {
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(23);
//        linkedList.add(24);
//        linkedList.add(25);
//        linkedList.add(26);
//        linkedList.add(27);
//        linkedList.offer(28);
////        for(Integer i : linkedList){
////            System.out.println(i);
////        }
//        Iterator iterator = linkedList.iterator();
//
//        ListIterator iterator = linkedList.listIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//
//

//
//        Vector vector = new Vector<>();
//        vector.add(20);
//        vector.add(21);
//        vector.add(22);
//        vector.add(23);
//        vector.add(24);
//        vector.add(25);
//
//        Vector vector1 = new Vector<>();
//        vector1.add(20);
//        vector1.add(21);
//        vector1.add(22);
//        vector1.add(23);
//        vector1.add(24);
//        vector1.add(25);
//
//
//        System.out.println(vector.capacity());
//        System.out.println(vector.size());
//        System.out.println(vector);
//        for (Object i : vector){
//            System.out.println(i);
//        }
//        System.out.println(vector.equals(vector1));
//


//
//        Stack <Integer> stack = new Stack<>();
//        stack.add(21);
//        stack.add(22);
//        stack.add(23);
//        stack.add(0,20);
//        stack.push(24);
//        System.out.println(stack);
//        System.out.println(stack.search(20));
//



//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.add(21);
//        arrayDeque.add(18);
//        arrayDeque.add(25);
//        arrayDeque.add(11);
//        System.out.println(arrayDeque);
//        System.out.println(arrayDeque.isEmpty());
//        System.out.println(arrayDeque.reversed());
//        System.out.println(arrayDeque.element());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(23);
        priorityQueue.add(34);
        priorityQueue.add(2);
        priorityQueue.add(76);
        priorityQueue.add(7);
        Comparator<Integer> comparator = Comparator.reverseOrder();
        PriorityQueue<Integer> q = new PriorityQueue<>(comparator);
        System.out.println(q);


    }
}
