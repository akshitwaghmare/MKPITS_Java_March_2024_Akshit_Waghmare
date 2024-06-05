package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Five {
    public static void main(String[] args) {
        int count=0;
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("grey");
        list.add("list");
        list.add("white");
        list.add("green");
        list.add("civic");
//        long result = list.stream().filter(n -> n.length() == 5).count();
//        list.stream().filter(n -> n.length() == 5).forEach(System.out::println);
//        System.out.println("Count : "+result);
//        long result1 = list.stream().filter(n -> n.length() == 4).count();
//        list.stream().filter(n -> n.length() == 4).forEach(System.out::println);
//        System.out.println("Count : "+result1);
//

        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);
    }
}
