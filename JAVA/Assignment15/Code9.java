package Assignment15;

import java.util.ArrayList;

public class Code9 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("green");
        colors.add("yellow");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("grey");
        colors2.add("white");
        colors2.add("black");
        colors2.add("pink");

        colors2.addAll(colors);
        System.out.println(colors2);
    }
}
