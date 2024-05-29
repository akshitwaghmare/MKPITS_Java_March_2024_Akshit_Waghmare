package Assignment16;

import java.util.Scanner;
import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(91);
        vector.add(62);
        vector.add(33);
        vector.add(74);
        vector.add(25);
        //Linear Search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To Search : ");
        int num = scanner.nextInt();

        boolean found = false;
        for (int i=0; i<vector.size(); i++){
            if (vector.get(i) == num){
                System.out.println("Number found : "+ num);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Number Not Found");
        }
    }
}
