#include<stdio.h>
main()
{
	float i=1,num,sum=0;
	printf("Enter N term: ");
	scanf("%f", &num);
	
	while(i <= num)
	{
		sum = sum + (1/i);
		i++;
	}
	printf("sum is %f",sum);
}
