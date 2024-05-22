#include <stdio.h>
#include<conio.h>
int main() 
{
    int basicsalary, allowance, deduction, netsalary;
	
	printf("Enter the basic salary: ");
    scanf("%d", &basicsalary);
    printf("Enter the total allowance: ");
    scanf("%d", &allowance);
    printf("Enter the total deduction: ");
    scanf("%d", &deduction);

	netsalary = basicsalary + allowance - deduction;

    printf("Net salary: %d", netsalary);
}