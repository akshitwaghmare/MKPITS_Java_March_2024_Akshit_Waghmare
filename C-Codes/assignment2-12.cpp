#include<stdio.h>
main()
{
	int i,num,sum=0;
	printf("Enter num: ");
	scanf("%d", &num);
	
	while(i <= num)
	{
		sum = sum + square(i);
		i++;
	}
	printf("sum is %d",sum);
}



