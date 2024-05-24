package Assignment15;

import java.util.ArrayList;

public class Code7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("green");
        colors.add("yellow");
        if(colors.contains("Red")){
            System.out.println("In arraylist");
        }
        else
            System.out.println("Not In arraylist");
    }
}
