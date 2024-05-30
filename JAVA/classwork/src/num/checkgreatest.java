package num;

import java.util.Scanner;

public class checkgreatest {

    public int check(int num[])
    {
        int greatest=0;
        for(int i=0; i<num.length; i++)
            if(num[i]>greatest)
            {
                greatest = num[i];
            }
        return greatest;
    }
}
