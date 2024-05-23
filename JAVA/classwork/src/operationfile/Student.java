package operationfile;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int marks;

    public Student(String name,int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//     //   return new Integer(this.marks).compareTo(((Student)o).getMarks());
//     //  return name.compareTo(((Student)o).name);
//        // OR
//        if(name.compareTo(((Student)o).name)==0)
//            return 0;
//        else if (name.compareTo(((Student)o).name)>0) {
//            return 1;
//        }
//        else
//            return 1;
//    }
}
