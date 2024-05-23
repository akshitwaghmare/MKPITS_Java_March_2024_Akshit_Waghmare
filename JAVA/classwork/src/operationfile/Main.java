package operationfile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String filePath = "NEWFILE";
//        String newFileName = "newFile.txt";
//        DeleteF.deleteFile(path);
//        DeleteF.rename(filePath,newFileName);
//        String filepath = "newFile.txt";
//        Student student = new Student("akshit",100);
//        DeleteF.writeOnFile(student,filepath);
//        DeleteF.writeOnFile(student);
//        Student student = DeleteF.readOnFile();
//        student.display();
        Scanner scanner = new Scanner(System.in);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
            System.out.println("Enter Choice");
            System.out.println("1.Add details");
            System.out.println("2.Display details");


            System.out.println("Exit");
            int choice = scanner.nextInt();
            while (choice != 3) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter Student Name : ");
                        String name = scanner.next();
                        System.out.println("Enter Student Marks : ");
                        int marks = scanner.nextInt();
                        Student student = new Student(name, marks);
                        objectOutputStream.writeObject(student);
                        System.out.println("Details Added Successfully");
                        break;
                    case 2:
                        readOnFile();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                System.out.println("Enter Choice");
                System.out.println("1.Add details");
                System.out.println("2.Display details");
                System.out.println("Exit");
                choice = scanner.nextInt();
            }
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void readOnFile(){
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
                System.out.println("Student Details");
                while(true){
                    Student student = (Student) objectInputStream.readObject();
                    System.out.println("Name : "+student.getName()+" Marks : "+student.getMarks());
                }
            } catch (Exception e) {
                System.out.println("Error Reading File");
            }
        }
}

