package Assignment15;

import java.util.LinkedList;

public class Code33 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        for (int i = 0; i < integer.size(); i++) {
            System.out.println("Position " + i + ": " + integer.get(i));
        }
    }
}
