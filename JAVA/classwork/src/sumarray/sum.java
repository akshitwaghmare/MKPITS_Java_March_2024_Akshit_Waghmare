package sumarray;

public class sum {
    public int sumofarray(int num[])
    {
        int sum=0;
        for(int i=0; i<num.length; i++)
        {
            sum = sum + num[i];
        }
        return sum;
    }
}
