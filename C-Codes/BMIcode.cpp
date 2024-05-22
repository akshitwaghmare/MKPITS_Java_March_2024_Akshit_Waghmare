#include<stdio.h>
#include<conio.h>
main()
{
	int weight, height, bmi;

    printf("Enter your weight : ");
    scanf("%d", &weight);
    printf("Enter your height : ");
    scanf("%d", &height);
    
    bmi = weight / (height * height);

    if (bmi < 18) 
	{
        printf("You are Underweight.");
    } 
	else if (bmi >= 18 && bmi < 25) 
	{
        printf("You are Normal.");
    } 
	else if (bmi >= 25 && bmi < 30) 
	{
        printf("You are Overweight.");
    } 
	else 
	{
        printf("Obese");
    }
}