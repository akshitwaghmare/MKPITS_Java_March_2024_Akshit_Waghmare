package Assignment15;

import java.util.ArrayList;
import java.util.Collections;

public class Code14 {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(25);
        integer.add(26);
        integer.add(27);
        integer.add(28);
        Collections.swap(integer,1,3);
        System.out.println(integer);
    }
}
