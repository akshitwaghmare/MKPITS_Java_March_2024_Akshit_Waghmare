package Assignment15;

import java.util.Iterator;
import java.util.LinkedList;

public class Code34 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        Integer i = 28;
        integer.remove(i);
        System.out.println(integer);
    }
}
