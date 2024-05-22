#include <stdio.h>
int main() 
{
    for (int i = 0; i <= 2; i++) 
	{
       for (int j = 0; j <= 2-i; j++) 
		{
            printf(" ");
        }
		for (int k = 0; k <= i; k++) 
		{
            printf("* ");
        }
		printf("\n");
    }
	for (int i = 2; i >= 0; i--) 
	{
        for (int j = 2 - i; j >= 0; j--) 
		{
            printf(" ");
        }
        for (int k = 0; k <= i; k++) 
		{
            printf("* ");
        }
        printf("\n");
	}
}		