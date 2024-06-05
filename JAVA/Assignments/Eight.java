package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eight {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        List<Integer> list1 = new ArrayList<>();
        list1.add(31);
        list1.add(32);
        list1.add(33);
        List<Integer> newlist = Stream.concat(list.stream(),list1.stream()).collect(Collectors.toList());
        System.out.println(newlist);

        int sum = newlist.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum : " + sum);
    }
}
