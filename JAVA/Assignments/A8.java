package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(23);
        int sum = list.stream().mapToInt(n->n).sum();
        long n= list.stream().count();
        System.out.println(sum/n);
    }
}
