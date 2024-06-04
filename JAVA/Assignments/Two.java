package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.stream().mapToDouble(n->n*2).forEach(System.out::println);
    }
}
