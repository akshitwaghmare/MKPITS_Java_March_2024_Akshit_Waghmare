package StreamWork20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.stream().collect(Collectors.partitioningBy(n->n%2==0)));
    }
}
