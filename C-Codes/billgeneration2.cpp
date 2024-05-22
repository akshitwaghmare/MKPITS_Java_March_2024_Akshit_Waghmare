#include<stdio.h>
main()
{
	int units,bill;
	
	printf("Enter units consumed: ");
	scanf("%d", &units);
	
	
	if (units <= 100) 
	{
        bill = units * 1;
		printf("bill is %d", bill);
    } 
	else if (units >= 100 && units <= 200)
	{
		bill = 100 + (units - 100) * 1.25;
		printf("bill is %d", bill);
	}
	else if (units >= 200 && units <= 300)
	{
		bill = 100 + 100 * 1.25 + (units - 200) * 1.50;
		printf("bill is %d", bill);
	}
	else if (units >= 300 && units <= 400)
	{
		bill = 100 + 100 * 1.25 + 100 * 1.50 + (units - 300) * 1.75;
		printf("bill is %d", bill);
	}	
	else
	{
		bill = 100 + 100 * 1.25 + 100 * 1.50 + (units - 300) * 2;
		printf("bill is %d", bill);
	}
}