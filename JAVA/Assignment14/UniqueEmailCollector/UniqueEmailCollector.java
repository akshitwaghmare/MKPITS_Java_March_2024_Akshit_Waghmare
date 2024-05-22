package UniqueEmailCollector;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmailCollector {
    HashSet<String> emails = new HashSet<>();


    public void addEmail(String email){
        if(emails.contains(email)){
            System.out.println("Email not added");
        }
        else
            emails.add(email);
            System.out.println("Email added successfully");
    }
    public void checkEmailexits(String checkemail){
        if(emails.contains(checkemail)){
                System.out.println("Email already exists");
            }
        else
                System.out.println("Email does not exists");
    }
    public void removeEmail(String removeemail){
        if(emails.contains(removeemail)){
            emails.remove(removeemail);
            System.out.println("Email removed successfully");
        }
        else
            System.out.println("Email address does not exists");
    }
    public void displayEmails() {
        if (emails.isEmpty()) {
            System.out.println("No email addresses found.");
        } else {
            System.out.println("email addresses:");
            for (String email : emails) {
                System.out.println(email);
            }
        }
    }

    public static void main(String[] args) {
        UniqueEmailCollector e = new UniqueEmailCollector();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Unique Email Collector");
            System.out.println("1-Add Email");
            System.out.println("2-Remove Email");
            System.out.println("3-Check Email");
            System.out.println("4-Display Email");
            System.out.println("5-EXIT");

            System.out.println("Enter Choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Email to Add : ");
                    String email = scanner.next();
                    e.addEmail(email);
                    break;
                case 2:
                    System.out.println("Enter Email to Remove : ");
                    String removeemail = scanner.next();
                    e.removeEmail(removeemail);
                    break;
                case 3:
                    System.out.println("Enter email to check : ");
                    String checkemail = scanner.next();
                    e.checkEmailexits(checkemail);
                    break;
                case 4:
                    e.displayEmails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice----Exiting");
            }
        }
    }
}
