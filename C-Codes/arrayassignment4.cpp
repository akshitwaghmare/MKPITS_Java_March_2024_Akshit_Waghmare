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

    for (i = 0; i < size / 2; i++) 
	{
        if (arr[i] == arr[size - i - 1]) 
		{
            printf("The array is a palindrome.\n");
        }
    }

    printf("The array is not a palindrome.\n");

}