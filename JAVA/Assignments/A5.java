package StreamWork20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("akshit");
        list.add("adarsh");
        list.add("daksh");
        list.add("akshat");
        list.add("gandhi");
        list.stream().sorted().toList().forEach(System.out::println);
        Collections.sort(list);
        System.out.println(list);
    }
}
