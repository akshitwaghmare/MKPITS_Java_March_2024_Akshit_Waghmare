#include <stdio.h>

int main() 
{
    int arr[100];
    int size, i;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

	printf("Enter the elements of the array: ");
    for (i = 0; i < size; i++) 
	{
        scanf("%d", &arr[i]);
    }
    
    printf("Enter the elements of the array: ");
    for (j = 0; j < size; j++) 
	{
        scanf("%d", &arr[j]);
    }
    
    printf("After merging elements of the array: ");
    for (k = 0; k < size*2; k++) 
	{
        print("%d",arr[j]);
    }