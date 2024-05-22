#include <stdio.h>
#include<conio.h>
int main() 
{
    int basicsalary, allowance, deduction, netsalary;
	
	printf("Enter the basic salary: ");
    scanf("%d", &basicsalary);

	
    if(basicsalary >= 25000 && basicsalary <= 50000)
    {
    	allowance = basicsalary * 0.20;
    	deduction = basicsalary * 0.18;
    	netsalary = basicsalary + allowance - deduction;
    	printf("Net salary: %d", netsalary);
	}
	else
	{
		printf("NETSALARY MUST BE GREATER THAN 25000$");
	}
}