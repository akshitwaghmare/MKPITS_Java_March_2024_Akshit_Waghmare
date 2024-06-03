package lamexp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        MyInterface myInterface = new MyInterface() {
            @Override
            public void display() {
                System.out.println("Implementing Anonymous Inner Class");
            }
        };
        myInterface.display();
        Shape shape = new Shape() {
            int radius;

            public void accept(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Radius : ");
                radius = scanner.nextInt();
            }
            @Override
            public void calArea() {
                accept();
                System.out.println("Area of Circle : "+Math.PI*radius*radius);
            }
        };
        shape.calArea();
        Calculation calculation = (a,b)->{
            return a+b;
        };
        System.out.println(calculation.calculate(23,34));
    }
}
