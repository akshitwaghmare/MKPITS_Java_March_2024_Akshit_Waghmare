#include<stdio.h>
main()
{
	int n1,n2;
	
	printf("Enter num: ");
	scanf("%d %d", &n1 , &n2);
	
	n1 = (n1 * n2) / n2;
	n2 = (n1 * n2) / n1;
	n1 = (n1 * n2) / n1;
	printf("num1= %d num2 = %d", n1, n2);
}