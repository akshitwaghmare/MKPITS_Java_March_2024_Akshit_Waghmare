#include<stdio.h>
main()
{
	int n1,n2;
	
	printf("enter two num:");
	scanf("%d %d",&n1,&n2);
	
	if (n1 > n2)
	{
		printf("%d is greater", n1);
	}
	else 
	{
		printf("%d is greater", n2);
	}
}