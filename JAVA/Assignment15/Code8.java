package Assignment15;

import java.util.ArrayList;
import java.util.Collections;

public class Code8 {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        Collections.sort(integer);
        System.out.println(integer);
    }
}
