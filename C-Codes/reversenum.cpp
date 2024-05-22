#include <stdio.h>
#include <conio.h>


int main() 
{
	int r,rev=0,num;
	printf("Enter 3 digit number: ");
	scanf("%d", &num);
	
	r = num % 10;
	rev = rev * 10 + r;
	num = num / 10;
	r = num % 10;
	rev = rev * 10 + r;
	num = num / 10;
	r = num % 10;
	rev = rev * 10 + r;
	
	printf("%d", rev);
	
}