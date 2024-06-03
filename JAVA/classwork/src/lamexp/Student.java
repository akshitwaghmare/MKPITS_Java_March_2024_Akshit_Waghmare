package lamexp;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("Akshit",67));
        arrayList.add(new Student("Adarsh",34));
        arrayList.add(new Student("Daksh",56));
        System.out.println(arrayList);
        Collections.sort(arrayList,(s1, s2)->{
            return s1.getName().compareTo(s2.getName());
        });
        System.out.println(arrayList);
        Collections.sort(arrayList,(s1,s2)-> {
            if(s1.getMarks()== s2.getMarks()){
                return 0;
            } else if (s1.getMarks()> s2.getMarks()) {
                return 1;
            }
            else
                return -1;
        });
        System.out.println(arrayList);
    }
}
