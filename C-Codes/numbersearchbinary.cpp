#include<stdio.h>
#include<conio.h>
int main()
{
	int arr[100];
	int n, min=0, max=9, mid, found=0, size;
	
	printf("Enter size of array: ");
	scanf("%d", &size);
	printf("Enter elements of array: \n");
	for(int i=0; i<size ; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("Enter a number : ");
	scanf("%d",&n);
	
	for(mid = (min+max)/2; min<max; mid = (min+max)/2 )
	{
		if( n == arr[mid] )
		{
			found = 1;
			break;
		}
		if( n > arr[mid] )
		{
			min = mid+1;
		}
		else
		{
			max = mid-1;
		}
		
	}
	if( found == 1 )
	{
		printf("Number found");
	}
	else
	{
		printf("Number not found");
	}
}