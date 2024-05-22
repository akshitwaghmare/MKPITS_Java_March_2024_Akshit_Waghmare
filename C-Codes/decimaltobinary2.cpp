#include<stdio.h>
main()
{
	//decimal to binary 
	int i=0,num,remainder,arr[5];
	printf("Enter Number: ");
	scanf("%d", &num);
	
	while(num >= 2) 
	{
        remainder = num % 2;  
		printf("%d",remainder);  
        num = num / 2;
    }

}
