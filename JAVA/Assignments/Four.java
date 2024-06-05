package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        double sum = list.stream().filter(n->n%2!=0).mapToDouble(n->n*2).sum();
        System.out.println(sum);
    }
}
