package classwork;

public class StaticDemo {

    static String name;

    static {
        name = "Akshit";
        System.out.println(name);
    }
    public void display(){
        System.out.println(name);
    }
}
