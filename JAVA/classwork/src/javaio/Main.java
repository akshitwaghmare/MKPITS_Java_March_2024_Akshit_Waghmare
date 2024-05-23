package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter student marks: ");
            String input = bufferedReader.readLine();
            int marks = Integer.parseInt(input);
            Studentpassfail student = new Studentpassfail(marks);
            student.checkPass();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
