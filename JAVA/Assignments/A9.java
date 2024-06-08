package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nagpur");
        list.add("pune");
        list.add("mumbai");
        list.add("indore");
        list.add("wardha");
        boolean check = list.stream().anyMatch(n->n.contains("a"));
        System.out.println(check);
    }
}
