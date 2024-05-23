package Insterface;

public class Calc {

    interface In1 {

        final int a = 10;
        void display();
    }

    class TestClass implements In1 {

        public void display(){
            System.out.println("result");
        }
    }
}
