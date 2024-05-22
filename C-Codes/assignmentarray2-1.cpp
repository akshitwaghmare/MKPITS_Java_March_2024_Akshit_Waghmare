#include <stdio.h>

int main() 
{
    int size1, size2, arr1[10], arr2[10], merge[20];

    printf("Enter the size of first array: ");
    scanf("%d", &size1);

    printf("Enter elements for first array: \n");
    for (int i = 0; i < size1; i++) 
    {
        scanf("%d", &arr1[i]);
    }

    printf("Enter the size of second array: ");
    scanf("%d", &size2);

    printf("Enter elements for second array: \n ");
    for (int i = 0; i < size2; i++) 
    {
        scanf("%d", &arr2[i]);
    }

    for (int i = 0; i < size1; i++) 
    {
        merge[i] = arr1[i];
    }

    for (int i = 0; i < size2; i++) 
    {
        merge[i] = arr2[i];
    }
	printf("Merged array: ");
    for (int i = 0; i < size1 + size2; i++) 
    {
        printf("%d \t", merge[i]);
    }
    	
}