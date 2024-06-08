package StreamWork20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A17 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(32);
        list.add(53);
        list.add(74);
        list.add(15);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
    }
}
