#include<stdio.h>
int factorial(int num);
main()
{
	int num,F;
	printf("Enter Number: ");
	scanf("%d", &num);
	
	F = factorial(num);
	printf("Factorial is %d", F);
}
int factorial(int num)
{
	int fact= 1,i=1;
	 while (i <= num) 
    {
        fact = fact * i;
        i++;
    }
    return fact;
}