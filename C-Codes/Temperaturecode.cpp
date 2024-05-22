#include<stdio.h>
#include<conio.h>
main()
{
    int choice,temp,conversion;

    printf("Select conversion:\n");
    printf("1. Celsius to Fahrenheit \n");
    printf("2. Fahrenheit to Celsius \n");
    scanf("%d", &choice);

    printf("Enter temperature: ");
    scanf("%d", &temp);

    switch (choice) 
	{
        case 1:
        	conversion = (temp * 9/5) + 32;
            printf("After conversion %d degree Fahrenheit", conversion);
            break;
        case 2:
  			conversion = (temp - 32) * 9/5;
  			printf("After conversion %d degree Celsius", conversion);
  			break;
        default:
            printf("Invalid choice");
            break;
    }

}
	