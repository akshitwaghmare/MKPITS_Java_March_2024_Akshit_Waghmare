#include<stdio.h>
int fact(int num);
int main()
{
	float i,sum=0,num;
	printf("Enter num: ");
	scanf("%f",&num);
	
	while(i<=num)
	{
		sum = sum + i/fact(i);
		i++;
	}
	printf("sum is %f",sum);
}
int fact(int num)
{
	int factorial=1,i=1;
	
	while(i <= num)
	{
		factorial = factorial * i;
		i++;
	}
	return factorial;
}