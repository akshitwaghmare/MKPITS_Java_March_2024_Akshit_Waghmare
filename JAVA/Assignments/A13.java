package StreamWork20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nagpur");
        list.add("pune");
        list.add("mumbai");
        list.add("indore");
        list.add("wardha");
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
    }
}
