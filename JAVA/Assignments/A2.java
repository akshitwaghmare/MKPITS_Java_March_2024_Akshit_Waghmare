package StreamWork20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
