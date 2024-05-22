#include <stdio.h>

int main() 
{
    int n, sum = 0;

    printf("Enter number: ");
    scanf("%d", &n);

    for (int i = 0;i <= n;i++) 
	{
        if (i % 3 == 0 && i % 5 == 0)
		{
            sum = sum + i;
        }
    }

    printf("The sum of the first %d natural numbers divisible by both 3 and 5 is: %d", n, sum);
}