#include<stdio.h>
#include<conio.h>
int sum(int a, int b);
int main()
{
	int s,x,y;
	printf("Enter x and y : ");
	scanf("%d %d",&x ,&y);
	
	s = sum(x,y);
	printf("%d", s);
}

int sum(int a, int b)
{
	int s;
	s = a+b;
	return s;
}

