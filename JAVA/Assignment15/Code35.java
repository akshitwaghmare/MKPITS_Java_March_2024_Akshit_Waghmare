package Assignment15;

import java.util.LinkedList;

public class Code35 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        integer.removeFirst();
        integer.removeLast();
        System.out.println(integer);
    }
}
