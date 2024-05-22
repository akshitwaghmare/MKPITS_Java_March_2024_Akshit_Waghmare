#include<stdio.h>
main()
{
	int n;
	printf("Enter num : ");
	scanf("%d",&n);
	
	if (n > 5)
	{
		printf("n is greater");
	}
	else if (n < 10)
	{
		printf("n is smaller than 10");
	}
}