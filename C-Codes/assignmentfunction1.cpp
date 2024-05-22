#include <stdio.h>

int evenodd(int num);

int main() 
{
    int number,even;

    printf("Enter a number: ");
    scanf("%d", &number);

    evenodd(number); 
	even=evenodd(number); 
	printf("%d is even", even);
    
}
int evenodd(int num)
{
    if (num % 2 == 0) 
	{
        return num;
    } 
	else 
	{
        printf("%d is odd.", num);
    }
}