package javaio;

public class Studentpassfail {
    private int marks;

    public Studentpassfail(int marks) {
        this.marks = marks;
    }

    public void checkPass() {
        if(marks > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
