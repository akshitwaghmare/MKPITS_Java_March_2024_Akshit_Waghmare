package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nagpur");
        list.add("pune");
        list.add("mumbai");
        list.add("indore");
        list.add("wardha");
        list.stream().filter(n->n.length()>=5).forEach(System.out::println);
    }
}
