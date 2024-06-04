package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class Three {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("daksh");
        list.add("nilay");
        list.add("yug");
        list.add("akshat");
        list.add("aadarsh");
        list.stream().sorted().forEach(System.out::println);
    }
}
