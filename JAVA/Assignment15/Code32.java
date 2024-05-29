package Assignment15;

import java.util.LinkedList;

public class Code32 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        integer.add(28);
        integer.add(27);
        System.out.println(integer.indexOf(28));
        System.out.println(integer.lastIndexOf(28));


    }
}
