package Assignment16;

import java.util.Collections;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(91);
        vector.add(62);
        vector.add(33);
        vector.add(74);
        vector.add(25);
        Collections.sort(vector);
        System.out.println(vector);
    }
}
