#include <stdio.h>

int main() 
{
    int n, num, greatest = 0, i = 0;

    printf("Enter the total number of numbers: ");
    scanf("%d", &n);
    
    printf("Enter numbers:\n");
    
    while (i < n) 
	{
        scanf("%d", &num);
        if (num > greatest)
        {
        	greatest = num;
		}
		i++;
    }
	printf("%d\n", greatest);
}