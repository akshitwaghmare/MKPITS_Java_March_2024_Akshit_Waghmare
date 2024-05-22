#include<stdio.h>
main()
{
	int arr[100],size,i,j;
	printf("Enter size of array: ");
	scanf("%d", &size);
	
	printf("Enter elements of array: \n");
	for (i=0;i<size;i++)
	{
		scanf("%d", &arr[i]);
		if (arr[i]== arr[size-i])
		{
			printf("\n");
		}
	}
	for (i=0;i<size;i++)
	{
		printf("%d",arr[i]);
	}
}