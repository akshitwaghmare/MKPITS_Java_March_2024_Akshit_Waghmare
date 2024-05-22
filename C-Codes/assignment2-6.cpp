#include<stdio.h>
void prime(int num);
main()
{
	int n,i;
	printf("Enter the limit upto: ");
	scanf("%d",&n);
	
	
	for (i = 2; i <= n; i++) 
	{
        prime(i);
    }
}
void prime(int num)
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
	if (num == i)
	printf("%d",num);
}