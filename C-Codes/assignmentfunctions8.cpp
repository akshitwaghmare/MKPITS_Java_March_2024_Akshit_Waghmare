#include<stdio.h>
void armstrong(int num);
main()
{
	int n,i,original;
	printf("Enter number : ");
	scanf("%d", &n);
	
	armstrong(n);
}
void armstrong(int num)
{
	int r,armstrong=0,original;
	original = num;
	while (num > 0)
	{
		r = num % 10;
		armstrong = armstrong + (r*r*r);
		num = num / 10;
	}
	if (armstrong==original)
	{
		printf("number is armstrong");
	}
	else
	{
		printf("not a armstrong");
	}
}