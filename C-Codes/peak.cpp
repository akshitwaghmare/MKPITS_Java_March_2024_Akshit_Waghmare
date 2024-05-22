#include <stdio.h>
int findPeak(int arr[], int size) 
{
    if (arr[0] >= arr[1]) 
	{
        return arr[0]; 
    }
    if (arr[size - 1] >= arr[size - 2]) 
	{
        return arr[size - 1]; 
    }
    for (int i = 1; i < size - 1; i++) 
	{
        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) 
		{
            return arr[i]; 
        }
    }
}
int main() 
{
    int arr[10];
    int size;
    
    printf("Enter size of array:\n");
	scanf("%d",&size);
	printf("Enter Elements: \n");
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}

    int peak = findPeak(arr, size);
    printf("Peak element is %d",peak);
}
