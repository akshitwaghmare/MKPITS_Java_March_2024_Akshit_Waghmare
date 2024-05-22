#include<stdio.h>
void rev(int num[],int size);
main()
{
	int arr[100],size,i,R;
	printf("Enter size of array: ");
	scanf("%d", &size);
	
	printf("Enter elements of array: \n");
	for (i=0;i<size;i++)
	{
		scanf("%d", &arr[i]);
	}
    rev(arr,size);
	
}
void rev(int arr[],int size)
{
	int i;
	printf("Array in reverse: \n");
	for(i=size-1;i>=0;i--)
	{
		printf("%d \n",arr[i]);
	}
}