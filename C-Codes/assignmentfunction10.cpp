#include<stdio.h>
int prime(int num);
main()
{
	int n,i;
	printf("Enter the limit upto : ");
	scanf("%d", &n);
	for (i = 1; i <= n; i++) 
	{
        if (i == prime(i)) 
		{
            printf("%d \n", i);
        }
    }
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
}