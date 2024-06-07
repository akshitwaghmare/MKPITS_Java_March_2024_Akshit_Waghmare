package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        int sum = list.stream().mapToInt(n->n).sum();
        System.out.println(sum);

    }
}
