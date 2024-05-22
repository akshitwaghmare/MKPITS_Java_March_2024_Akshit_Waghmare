#include <stdio.h>

int main() 
{
    int arr[10], i, j, count, x;
    
    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
    {
        scanf("%d", &arr[i]);
    }
    
    for(i = 0; i < 10; i++) 
    {
        if(arr[i] != 0) 
        {
            count = 1;
            for(j = i + 1; j < 10; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    count++;
                    arr[j] = 0;
                }
            }
            printf("%d is %d times\n", arr[i], count);
        }
    }
}