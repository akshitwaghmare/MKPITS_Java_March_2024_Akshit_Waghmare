#include<stdio.h>
main()
{
	int i = 0,sum = 0,n;
	
	printf("Enter ten numbers: \n");
	
	do
	{
		scanf("%d", &n);
		sum = sum + n;
		i++;
	}
	while(i<10);
	{
		printf("sum = %d",sum);
	}		
}