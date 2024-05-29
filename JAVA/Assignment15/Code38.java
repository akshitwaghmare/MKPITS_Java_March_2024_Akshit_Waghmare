package Assignment15;

import java.util.Collections;
import java.util.LinkedList;

public class Code38 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        Collections.shuffle(integer);
        System.out.println(integer);
    }
}
