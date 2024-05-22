#include <stdio.h>

int main() 
{
    int angle;
    
    printf("Enter Angle: ");
    scanf("%d", &angle);

    if (angle > 0 && angle < 90) 
	{
        printf("Acute angle");
    } 
	else if (angle == 90) 
	{
        printf("Right anlge");
    } 
	else if (angle > 90 && angle < 180) 
	{
        printf("Obtuse angle");
    } 
	else if (angle == 180) 
	{
        printf("Straight");
    } 
	else
	{
        printf("Invalid Input");
    }
}