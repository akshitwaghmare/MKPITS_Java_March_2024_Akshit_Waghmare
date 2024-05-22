#include<stdio.h>
int main() 
{
    int choice,total,tip;
    int samosa=10;
	int kachori=20;
	int dhokla=15;
	int jalebi=25;
	int tax=2; 


    printf("MENU:\n");
    printf("1. Samosa - 10$ \n");
    printf("2. Kachori - 20$ \n-");
    printf("3. Dhokla - 15$ \n");
    printf("4. Jalebi - 25$ \n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) 
	{
        total = samosa + tax;
        printf("Total bill = %d", total);
    } 
	else if (choice == 2) 
	{
        total = kachori + tax;
        printf("Total bill = %d", total);
    } 
	else if (choice == 3) 
	{
        total = dhokla + tax;
        printf("Total bill = %d", total);
    } 
	else if (choice == 4) 
	{
        total = jalebi + tax;
        printf("Total bill = %d", total);
    } 
	else 
	{
        printf("Invalid choice");
    }

}