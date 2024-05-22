#include<stdio.h>
int reverse(int num);
main()
{
	int num,R;
	printf("Enter Number: ");
	scanf("%d", &num);
	
	R = reverse(num);
	printf("reverse is %d", R);
}
int reverse(int num)
{
	int r,rev=0;
	for(;num > 0;)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	return rev;
}