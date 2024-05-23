package classwork;

public class Main {

    public static void sum(int...num){
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args){
        sum(23,34,45,56);
    }
}
