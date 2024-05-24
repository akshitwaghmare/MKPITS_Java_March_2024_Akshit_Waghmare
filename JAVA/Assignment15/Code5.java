package Assignment15;

import java.util.ArrayList;

public class Code5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("green");
        colors.add("yellow");
        colors.set(2,"grey");
        System.out.println(colors);
    }
}
