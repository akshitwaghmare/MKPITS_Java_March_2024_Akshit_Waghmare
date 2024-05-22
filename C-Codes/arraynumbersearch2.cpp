#include<stdio.h>
main()
{
	int arr[10]={1,2,3,4,5,6,7,8,9,10};
	int num,found=0,count=0;
	
	printf("Enter number: ");
	scanf("%d", &num);
	
	for (int i = 0; i < 10; i++)
	{
			if(num == arr[i])
			{
				found=1;
				count++;
			} 
	}
	if(found==1)
	{
		printf("NUMBER FOUND %d TIMES", count);
	}
	else 
	{
		printf("NUMBER NOT FOUND");
	}
}