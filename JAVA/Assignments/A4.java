package StreamWork20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class A4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("akshit");
        list.add("adarsh");
        list.add("daksh");
        list.add("akshat");
        list.add("gandhi");
        list.stream().map(n->n.toUpperCase()).forEach(System.out::println);

    }
}
