#include <stdio.h>

int main() 
{
    int arr[10], i, j, count;

    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
    {
        scanf("%d", &arr[i]);
    }
    
    printf("New Array :\n ");
    for(i = 0; i < 10; i++) 
    {
        if(arr[i] != 0) 
        {
            printf("%d \n ", arr[i]);
            for(j = i + 1; j < 10; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    arr[j] = 0;
                }
            }
        }
    }
}
