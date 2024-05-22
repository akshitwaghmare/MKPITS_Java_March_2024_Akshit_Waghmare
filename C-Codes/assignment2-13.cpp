#include<stdio.h>
int factorial(int n); 
int main()
{
	int number,fact,digits=0,i;
    

    printf("Enter a number: ");
    scanf("%d", &number);

    fact = factorial(number);

    while (fact != 0) 
	{
        fact = fact / 10;
        digits++;
    }

    printf("Number of digits in %d! = %d\n", number, digits);

}
int factorial(int n)
{
    int fact = 1,i=1;
    while(i <= n)
	{
		fact = fact * i;
		i++;
	}
	
    return fact;
}