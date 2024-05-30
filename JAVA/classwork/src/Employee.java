import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;

    public void acceptDetails()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:\n");
        name = scanner.nextLine();
        System.out.println("Enter salary:\n");
        salary = scanner.nextInt();
    }
    public void displayDetails()
    {
        System.out.println(name);
        System.out.println(salary);
    }
}
