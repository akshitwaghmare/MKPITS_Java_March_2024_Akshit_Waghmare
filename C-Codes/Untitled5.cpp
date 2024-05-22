#include<stdio.h>

main()
{
	//decimal to binary 
	int i=0,num,remainder;
	printf("Enter Number: ");
	scanf("%d", &num);
	
	while(num > 0) 
	{
		remainder = num % 2;
		printf("%d", remainder);
		num = num / 2;
	}
}