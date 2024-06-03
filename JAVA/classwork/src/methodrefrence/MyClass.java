package methodrefrence;

public class MyClass {

    public MyClass() {
        System.out.println("Default constructor");
    }

    public MyClass(String nm) {
        System.out.println("This is a parameterized constructor");
    }

    public void displayDetails(String nm) {
        System.out.println("Boyz On Top");
    }

    public static void disp(String nm) {
        System.out.println("Static method called");
    }

}
