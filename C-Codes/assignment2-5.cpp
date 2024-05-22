#include<stdio.h>
int armstrong(int num);
main()
{
	int n,i;
	printf("Enter the limit upto : ");
	scanf("%d", &n);
	
	for (i = 1; i <= n; i++) 
	{
        if (i == armstrong(i)) 
		{
            printf("%d \n", i);
        }
    }

}
int armstrong(int num)
{
	int r,armstrong=0;
	while (num > 0)
	{
		r = num % 10;
		armstrong = armstrong + (r*r*r);
		num = num / 10;
	}
	return armstrong;
}