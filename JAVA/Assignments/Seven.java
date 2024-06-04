package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class Seven {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(4);
        list.add(24);
        list.add(13);
        list.stream().filter(n->n>10).forEach(System.out::println);
    }
}
