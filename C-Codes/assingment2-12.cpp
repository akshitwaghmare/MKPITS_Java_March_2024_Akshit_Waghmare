#include<stdio.h>
main()
{
	int n, sum = 0;

    printf("Enter num: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) 
	{
        sum = sum + i * i;
    }
	printf("sum of series is %d", sum);
}