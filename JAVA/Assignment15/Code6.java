package Assignment15;

import java.util.ArrayList;

public class Code6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("green");
        colors.add("yellow");
        colors.remove(3);
        System.out.println(colors);
    }
}
