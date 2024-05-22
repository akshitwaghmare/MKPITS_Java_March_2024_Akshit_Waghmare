#include<stdio.h>
#include<conio.h>
main()
{	
	int i,num,r,armstrong=0,original;
	printf("Enter num: ");
	scanf("%d",&num);
	original = num;

	while (num > 0)
	{
		r = num % 10;
		armstrong = armstrong + (r*r*r);
		num = num / 10;
	}
	if (armstrong==original)
	{
		printf("num is armstrong");
	}
	else
	{
		printf("not a armstrong");
	}
	
}