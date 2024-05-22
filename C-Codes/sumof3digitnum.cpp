#include <stdio.h>
#include <conio.h>


int main() 
{
	int r,sum=0,num;
	printf("Enter 3 digit number: ");
	scanf("%d", &num);
	
	r = num % 10;
	sum = sum + r;
	num = num / 10;
	r = num % 10;
	sum = sum + r;
	num = num / 10;
	r = num % 10;
	sum = sum + r;
	
	printf("%d",sum);
	
}