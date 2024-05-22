package TaskManagementSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TaskManagementSystem {
    private LinkedList<Task> tasks;

    public TaskManagementSystem() {
        tasks = new LinkedList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public boolean removeTaskById(int taskId){
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }
    public Task SearchTaskById(int taskId){
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

//    public void displayAllTasksSortedByDueDate() {
//        Collections.sort(tasks, new Comparator<Task>() {
//            @Override
//            public int compare(Task t1, Task t2) {
//                return t1.getDueDate().compareTo(t2.getDueDate());
//            }
//        });
//
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
//    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        int choice;

        do {
            System.out.println("\nTask Management System Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task by Task ID");
            System.out.println("3. Search Task by Task ID");
            System.out.println("4. Display All Tasks Sorted by Due Date");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Due Date (dd-MM-yyyy): ");
                    int dueDate = scanner.nextInt();
                    break;
                case 2:
                    // Remove Task by Task ID
                    System.out.print("Enter Task ID to remove: ");
                    int removeTaskId = scanner.nextInt();
                    if (tms.removeTaskById(removeTaskId)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    // Search Task by Task ID
                    System.out.print("Enter Task ID to search: ");
                    int searchTaskId = scanner.nextInt();
                    Task task = tms.SearchTaskById(searchTaskId);
                    if (task != null) {
                        System.out.println("Task found: " + task);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 4:
                    // Display All Tasks Sorted by Due Date
                    System.out.println("All tasks sorted by due date:");
                   // tms.displayAllTasksSortedByDueDate();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
