#include<stdio.h>
main()
{
	int arr[100],size,temp,i,j,k;
	
	printf("Enter size of array: ");
	scanf("%d", &size);
	
	printf("Enter elements of array: \n");
	for(i=0; i<size ; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	for(i=0; i < size - 1; i++)
	{
		for(j=i+1; j < size; j++)
		{
			if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printf("array in ascending order: \n");
	
	for(i=0; i<size ; i++)
	{
		printf("%d \t", arr[i]);
	}	
}