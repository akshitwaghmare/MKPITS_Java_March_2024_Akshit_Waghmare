#include<stdio.h>
int greater(int num1, int num2);
int main()
{
	int num1, num2,G;

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    G = greater(num1, num2);

    printf("The greater number is: %d\n", G);

}
int greater(int num1, int num2)
{
    if (num1 > num2) 
	{
        return num1;
    } 
	else 
	{
        return num2;
    }
}