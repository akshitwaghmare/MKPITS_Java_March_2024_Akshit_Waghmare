package StudentManagementSysytem;

import java.util.*;

public class StudentManagementSystem {
    public ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(int id, String name, int grade) {
        students.add(new Student(id, name, grade));
    }
    public void removeStudentById(final int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
            }
        }
    }
    public Student searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public void displayStudents() {
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student by id");
            System.out.println("3. Search for a student by id");
            System.out.println("4. Display all students sorted by grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    studentManagementSystem.addStudent(id, name, grade);
                    break;
                case 2:
                    System.out.print("Enter student id to remove: ");
                    int removeId = scanner.nextInt();
                    studentManagementSystem.removeStudentById(removeId);
                    System.out.println("student id removed.");
                    break;
                case 3:
                    System.out.print("Enter student id to search: ");
                    int searchId = scanner.nextInt();
                    Student student = studentManagementSystem.searchStudentById(searchId);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    studentManagementSystem.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}