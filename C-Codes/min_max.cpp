#include <stdio.h>

int main() 
{
    int size;
    int array[10];
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    printf("Enter elements:\n");
    for (int i = 0; i < size; i++) 
	{
        scanf("%d", &array[i]);
    }

    int min = array[0]; 
    int max = array[0];

    for (int i = 1; i < size; i++) 
	{
        if (array[i] < min) 
		{
            min = array[i];
        }
        else if (array[i] > max) 
		{
            max = array[i]; 
        }
    }

    printf("Smallest element: %d\n", min);
    printf("Largest element: %d\n", max);

}
