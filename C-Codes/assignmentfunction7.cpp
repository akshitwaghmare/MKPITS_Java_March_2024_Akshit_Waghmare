#include<stdio.h>
int prime(int num);
main()
{
	int num,P;
	printf("Enter Number: ");
	scanf("%d", &num);
	
	prime(num);
}
int prime(int num)
{
	int i=2;
	while (i < num)
	{
		if(num % i == 0)
		{
			break;
		}
		i++;
	}
	if(num == i)
	{	
		printf("PRIME NUMBER");
	}
	else
	{
		printf("NOT A PRIME NUMBER");                                                                                                      
	}
}
	