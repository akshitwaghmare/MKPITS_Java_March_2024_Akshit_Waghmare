package Assignment15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Code45 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        ArrayList<Integer> arrayList = new ArrayList<>(integer);
        System.out.println(arrayList);
    }
}
