package collectionDemo;

import operationfile.Student;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo2 {
    public static void main(String[] args) {

        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        System.out.println(linkedList);
        for(Integer number : linkedList){
            System.out.println(number);
        }
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        LinkedList <Student> linkedList1 = new LinkedList<>();
        linkedList1.add(new Student("akshit",99));
        linkedList1.add(new Student("akshat",98));
        linkedList1.add(new Student("adarsh",99));

        for(Student student : linkedList1) {
            System.out.println(student);
        }
    }
}
