package collectionDemo;

import javaio.Studentpassfail;
import operationfile.Student;

import java.util.*;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //Initialising list using returned by asList() method of Arrays class
        List<Integer> list = Arrays.asList(23,14,55,26,37,78,69);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Passing another collection to constructor of arraylist
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
        //Initialising arraylist using double braces (anonymous inner class)
        ArrayList<Integer> arrayList1 = new ArrayList<>(){{
           add(23);
           add(24);
           add(25);
        }};
        System.out.println(arrayList1);
        List<Integer> list1 = Arrays.asList(23,23,24,25,26);
        HashSet<Integer> set = new HashSet<Integer>(list1);
        System.out.println(set);


        Collections.sort(list);
        System.out.println(list);
        ArrayList<Student> studentArrayList = new ArrayList<>(){{
            add(new Student("akshit",98));
            add(new Student("zion",78));
            add(new Student("daksh",87));
        }};

//        Collections.sort(arrayList);
//        System.out.println(studentArrayList);
        Collections.sort(studentArrayList,new MarksComparator());
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList,new NameComparator());
        System.out.println(studentArrayList);
    }
}
