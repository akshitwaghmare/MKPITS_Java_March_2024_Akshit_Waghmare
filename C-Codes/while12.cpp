#include<stdio.h>
main()
{
	int num,i=2;
	
	printf("Enter number: ");
	scanf("%d", &num);
	
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