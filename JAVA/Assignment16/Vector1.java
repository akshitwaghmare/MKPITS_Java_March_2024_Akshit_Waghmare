package Assignment16;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(21);
        vector.add(22);
        vector.add(23);
        vector.add(24);
        vector.add(25);
        vector.remove(4);
        System.out.println(vector.size());
        System.out.println(vector);
    }
}
