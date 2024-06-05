package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nine {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("TOYOTA");
        list.add("AUDI");
        list.add("MARUTI");
        list.add("VOLKSWAGEN");
        list.add("ASTON MARTIN");


        List<String> filtered = list.parallelStream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
