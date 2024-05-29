package Assignment15;

import java.util.Collections;
import java.util.LinkedList;

public class Code40 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);

        LinkedList<Integer> integer1 = new LinkedList<>();
        integer1.add(38);
        integer1.add(37);
        integer1.add(36);
        integer1.add(35);
        Collections.copy(integer1,integer);
        System.out.println(integer1);

        }
}
