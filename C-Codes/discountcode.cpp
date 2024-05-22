#include <stdio.h>
#include <math.h>

int main() 
{
	
    int totalamt,discount;

    printf("Enter total purchase amount: ");
    scanf("%d", &totalamt);

    if (totalamt >= 1000) 
	{
        discount = totalamt * 10/100;
		printf("You are eligible for a discount of %d", discount);
    } 
	else 
	{
        printf("You are not eligible for a discount.");
    }

}