#include <stdio.h>
#include<conio.h>
int main() 
{
    int a,b,c;

    printf("Enter the lengths of three sides of a triangle:\n");
    scanf("%f %f %f", &a, &b, &c);
    
    if (a == b && b == c) 
	{
        printf("It's an equilateral triangle.");
    } 
    else if (a == b || a == c || b == c) 
	{
        printf("It's an isosceles triangle.");
    } 
    else {
        printf("It's a scalene triangle.\n");
    }
}