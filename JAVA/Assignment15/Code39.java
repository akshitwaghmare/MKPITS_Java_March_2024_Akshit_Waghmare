package Assignment15;

import java.util.Collections;
import java.util.LinkedList;

public class Code39 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        LinkedList<Integer> integer1 = new LinkedList<>();
        integer1.add(28);
        integer1.add(27);
        integer1.add(26);
        integer1.add(25);
        integer.addAll(integer1);
        System.out.println(integer);
    }
}
