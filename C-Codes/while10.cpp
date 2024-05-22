#include<stdio.h>
main()
{
	int r,rev=0,num;
	printf("Enter Number: ");
	scanf("%d",&num);
	
	for(;num > 0;)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	printf(" reverse is %d",rev);
}