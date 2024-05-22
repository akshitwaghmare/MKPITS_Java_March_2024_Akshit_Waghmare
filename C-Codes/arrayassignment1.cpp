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
		for(j=0; j < (size-1)-i; j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	printf("array in ascending order: \n");
	
	printf("%d", arr[i]);
	
}