package Assignment15;

import java.util.ArrayList;

public class Code15 {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(25);
        integer.add(26);
        integer.add(27);
        integer.add(28);
        ArrayList<Integer> integer1 = new ArrayList<>();
        integer1.add(25);
        integer1.add(26);
        integer1.add(27);
        integer1.add(28);
        integer.addAll(integer1);
        System.out.println(integer);
    }
}
