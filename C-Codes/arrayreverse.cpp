#include<stdio.h>
int rev(int num[]);
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
	rev(arr[i]);
}
void rev(int num[])
{
	int i,size;
	printf("Array in reverse: \n");
	for(i=size-1;i>=0;i--)
	{
		printf("%d \n",arr[i]);
	}
}