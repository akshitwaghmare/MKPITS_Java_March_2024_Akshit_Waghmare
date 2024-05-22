#include<stdio.h>
#include<conio.h>
main()
{
    int choice,balance = 1000,deposit,withdraw;

    printf("Welcome to Your ATM!");

        printf("\nWhat would you like to do?\n");
        printf("1. Check Balance\n");
        printf("2. Deposit\n");
        printf("3. Withdraw\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) 
		{
            case 1:
                printf("Your current balance is: %d", balance);
                break;
            case 2:
                printf("Enter the amount you want to deposit: ");
                scanf("%d", &deposit);
                balance = balance + deposit;
                printf("Deposit successful! Your balance is: %d", balance);
                break;
            case 3:
                printf("Enter the amount you want to withdraw: ");
                scanf("%d", &withdraw);
                balance = balance - withdraw;
                    printf("Withdrawal successful! Your new balance is: %d", balance);
                break;
            default:
                printf("Exit");
                break;
        }
    
}