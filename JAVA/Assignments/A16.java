package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A16 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.stream().skip(1).forEach(System.out::println);
    }
}
