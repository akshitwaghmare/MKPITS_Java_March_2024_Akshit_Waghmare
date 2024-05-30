package tempConv;

public class TempratureConverter {
    public void celciusTofahrenhit(double no) {
        double result=(no*(9/5))+32;
        System.err.println(no +"celcius to fahrenhit is "+result);
    }
    public void fahrenhitTocelcius(double no) {
        double result=(no-32)*5/9;
        System.err.println(no +"fahrenhit to celcius"+result);
    }
}
