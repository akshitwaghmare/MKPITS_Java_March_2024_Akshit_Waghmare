#include <stdio.h>

int passfail(int marks); 
int main() 
{
    int marks;

    printf("Enter marks: ");
    scanf("%d", &marks);

    passfail(marks);

    return 0;
}
int passfail(int marks)
{
    if (marks >= 50) 
	{
        printf("Pass");
    } 
	else 
	{
        printf("Fail");
    }
}