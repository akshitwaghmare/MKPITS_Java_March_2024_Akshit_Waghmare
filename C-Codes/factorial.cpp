#include<stdio.h>
main()
{
	int num,factorial=1,i=1;
	printf("Enter num: ");
	scanf("%d",&num);
	
	while(i <= num)
	{
		factorial = factorial * i;
		i++;
	}
	printf("factorial is %d",factorial);
}