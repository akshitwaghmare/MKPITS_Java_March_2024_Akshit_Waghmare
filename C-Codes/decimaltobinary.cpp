#include<stdio.h>
main()
{
	//decimal to binary 
	int i=0,num,remainder[5],arr[5];
	printf("Enter Number: ");
	scanf("%d", &num);
	
	while(num > 0 && i<5) 
	{
        remainder[i] = num % 2;    
        num = num / 2;
        i++;
    }
	for (i=0; i < 5; i++)
	{
		printf("%d", remainder[i]);
	}
}
