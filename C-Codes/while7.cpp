#include <stdio.h>

int main() {
    int n, num, counteven = 0, countodd = 0, i = 0;

    printf("Enter the total number of numbers: ");
    scanf("%d", &n);
	
    while (i < n) 
	{
		printf("Enter numbers:\n");
        scanf("%d", &num);
        if (num % 2 == 0)
        {
			counteven++;
		}
        else
        {
			countodd++;
		}
        i++;
    }

    printf("Total even numbers: %d\n", counteven);
    printf("Total odd numbers: %d\n", countodd);
}