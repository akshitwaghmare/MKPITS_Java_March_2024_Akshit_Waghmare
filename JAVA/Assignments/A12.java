package StreamWork20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nagpurorangecity");
        list.add("pune");
        list.add("mumbai");
        list.add("indore");
        list.add("wardha");
        System.out.println(list.stream().max(Comparator.comparing(String::length)));
    }
}
