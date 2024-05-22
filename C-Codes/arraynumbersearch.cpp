#include<stdio.h>
main()
{
	int arr[100];
	int num,size,found=0,count=0;
	
	printf("Enter size of array: ");
	scanf("%d", &size);
	printf("Enter elements of array: \n");
	for(int i=0; i<size ; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("Enter Number: ");
	scanf("%d", &num);
	
	for (int i=0; i < size; i++)
	{
		if(num == arr[i])
		{
			found = 1;
			count++;
		}
	}
	if(found == 1)
	{
		printf("NUMBER FOUND %d TIMES", count);
	}
	else 
	{
		printf("NUMBER NOT FOUND");
	}
	
}