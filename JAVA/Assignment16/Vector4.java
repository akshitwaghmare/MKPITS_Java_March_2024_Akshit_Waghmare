package Assignment16;

import java.util.Vector;

public class Vector4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(91);
        vector.add(62);
        vector.add(33);
        vector.add(74);
        vector.add(25);
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(11);
        vector1.add(92);
        vector1.add(73);
        vector1.add(64);
        vector1.add(45);
        //Add
        for (int i = 0; i < vector.size(); i++) {
            int sum = vector.get(i) + vector1.get(i);
            System.out.println("Addition of " + vector.get(i) + " and " + vector1.get(i) + " = " + sum);
        }
        //Sub
        for (int i = 0; i < vector.size(); i++) {
            int sub = vector.get(i) - vector1.get(i);
            System.out.println("Subtraction of " + vector.get(i) + " and " + vector1.get(i) + " = " + sub);
        }
        //Dot Product
        for (int i = 0; i < vector.size(); i++) {
            int sub = vector.get(i) * vector1.get(i);
            System.out.println("Multiplication of " + vector.get(i) + " and " + vector1.get(i) + " = " + sub);
        }
    }
}
