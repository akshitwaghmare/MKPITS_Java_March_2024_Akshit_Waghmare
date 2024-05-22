#include <stdio.h>

int main() 
{
    int arr[10], i, j, found;

    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
    {
        scanf("%d", &arr[i]);
    }
    
    for(i = 0; i < 10; i++) 
    {
        found = 0;
        if(arr[i] != 0) 
        {
            for(j = 0; j < 10; j++) 
            {
                if(i != j && arr[i] == arr[j]) 
                {
                    found = 1;
                    break;
                }
            }
            if(found == 0)
            {
                printf("First non duplicate Element: %d\n", arr[i]);
                break;
            }
        }
    }

    return 0;
}
