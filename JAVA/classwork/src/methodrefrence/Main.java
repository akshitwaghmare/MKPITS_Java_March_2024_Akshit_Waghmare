package methodrefrence;

import lamexp.MyInterface;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        UserInterface userInterface1 = myClass::displayDetails;
        userInterface1.display("sm");

        UserInterface userInterface2 = MyClass::disp;
        userInterface2.display("sm");

        UserInterface userInterface3 = MyClass::new;
        userInterface3.display("parameter");
    }
}
