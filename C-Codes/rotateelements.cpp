#include <stdio.h>

int main() 
{
    int size,arr[10];
    printf("Enter the size of the array: ");
    scanf("%d", &size);


    printf("Enter %d elements for the array:\n", size);
    for (int i = 0; i < size; i++) 
	{
        scanf("%d", &arr[i]);
    }

    int lastelement = arr[size - 1];
    for (int i = size - 1; i > 0; i--) 
	{
        arr[i] = arr[i - 1];
    }
    arr[0] = lastelement;

    printf("Rotated array:\n");
    for (int i = 0; i < size; i++) 
	{
        printf("%d\n", arr[i]);
    }
}