#include<stdio.h>
int pallindrome(int num);
main()
{
	int num,i,originalnum,rev;
	
	printf("Enter number: ");
	scanf("%d", &num);
	
	originalnum = num;
	rev = pallindrome(num);
	if (originalnum == rev)
	{
		printf("Number is pallindrome");
	}
	else
	{
		printf("Not a pallindrome");
	}
}
int pallindrome(int num)
{
	int i,rev=0,r;
	
	while (num>0)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	return rev;	
}