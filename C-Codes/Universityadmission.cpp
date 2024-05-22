#include<stdio.h>
#include<conio.h>
main()
{
	
    float jee,school;

    printf("Enter entrance exam score: ");
    scanf("%f", &jee);
    printf("Enter previous academic score: ");
    scanf("%f", &school);
 
    if (jee >= 90 && school >= 90) 
	{
        printf("You are eligible for admission to the university.");
    } 
	else 
	{
        printf("You are not eligible for admission to the university.");
	}
}
	