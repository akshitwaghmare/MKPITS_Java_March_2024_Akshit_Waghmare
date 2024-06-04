package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("toyota","BMW","Audi","Honda");
        System.out.println(list);

        List<Integer> list1 = new ArrayList<Integer>(){{
           add(51);
           add(72);
           add(23);
           add(24);
           add(28);
        }};
        System.out.println(list1);

        Stream<String> stringStream = list.stream();
        stringStream.map(n->n.toUpperCase()).forEach(n-> System.out.println(n));
        //Alternative
        list.stream().map(n->n.toUpperCase()).forEach(n-> System.out.println(n));
        //to print even numbers
        list1.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        Stream<Integer> num = Stream.of(2,3,4,5,6,7,8,9);
        num.forEach(System.out::println);

        list.stream().filter(n->n.startsWith("H")).forEach(System.out::println);
    }
}
