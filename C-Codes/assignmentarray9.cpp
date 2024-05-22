#include <stdio.h>

int main() 
{
    int size,arr[size];
    printf("Enter the size of the array: ");
    scanf("%d", &size);


    printf("Enter %d elements for the array: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    int lastelement = arr[size - 1];
    for (int i = size - 1; i > 0; i--) 
	{
        arr[i] = arr[i - 1];
    }
    arr[0] = lastelement;

    printf("Rotated array: ");
    for (int i = 0; i < size; i++) 
	{
        printf("%d", arr[i]);
    }
}