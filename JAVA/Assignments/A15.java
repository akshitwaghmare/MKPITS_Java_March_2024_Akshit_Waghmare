package StreamWork20;

import java.util.ArrayList;
import java.util.List;

public class A15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.stream().reduce(1,(a,b)->a*b));
    }
}
