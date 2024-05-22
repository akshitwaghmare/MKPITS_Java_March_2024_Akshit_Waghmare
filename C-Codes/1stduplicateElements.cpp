#include <stdio.h>

int main() 
{
    int arr[10], i, j, found=0;

    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
    {
        scanf("%d", &arr[i]);
    }
    
    printf("New Array :\n");
    for(i = 0; i < 10; i++) 
    {
        if(arr[i] != 0) 
        {
            for(j = i + 1; j < 10; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    printf("First duplicate Element: %d",arr[i]);
                    found=1;
                    break;
                }
            }
            if(found==1)
            {
            	break;
			}
        }
    }
}
