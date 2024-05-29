package Assignment15;

import java.util.Iterator;
import java.util.LinkedList;

public class Code24 {
    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(28);
        integer.add(27);
        integer.add(26);
        integer.add(25);
        Iterator iterator = integer.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
