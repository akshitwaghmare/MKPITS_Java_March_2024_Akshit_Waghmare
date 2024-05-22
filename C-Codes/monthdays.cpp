#include <stdio.h>

int main() 
{
    int month,days,year;

    printf("Enter the month number : ");
    scanf("%d", &month);
	
	printf("Enter year: ");
	scanf("%d", &year);
	    switch (month) 
	{
        case 1:
            printf("January - 31 days");
            break;
        case 2:
        	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			{
                printf("February - 29days");
            } 
			else 
			{
                printf("February - 28days");
            }
            break;
        case 3:
            printf("March - 31days");
            break;
        case 4:
            printf("April - 30days");
            break;
        case 5:
            printf("May - 31days");
            break;
        case 6:
            printf("June - 30days");
            break;
        case 7:
            printf("July - 31days");
            break;
        case 8:
            printf("August - 31days");
            break;
        case 9:
            printf("September - 30days");
            break;
        case 10:
            printf("October - 31days");
            break;
        case 11:
            printf("November - 30days");
            break;
        case 12:
            printf("December - 31days");
            break;
        default:
            printf("Invalid");
            break;
    }
}