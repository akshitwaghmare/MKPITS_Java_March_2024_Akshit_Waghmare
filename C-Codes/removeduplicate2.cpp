#include<stdio.h>
#include<stdlib.h>

int main() 
{
    int arr[10], *ptr;
    int i, j, count; 
    printf("Enter number:\n");
    for(i = 0; i < 10; i++) 
	{
        scanf("%d", &arr[i]);
    }
    for(i = 0; i < 10; i++) 
	{  
        if(arr[i] == 0) 
		{
            continue;
        }
        count=1;
        for(j = i + 1; j < 10; j++) 
		{
            if(arr[i] == arr[j]) 
			{
                count++;
                arr[j] = 0;
            }
        }
    }
    printf("count = %d", count);
    ptr = (int*)malloc(sizeof(int) * count);
    for(i = 0, j = 0; i < 10, j < count; i++) 
	{
        if(arr[i] != 0) 
		{
            ptr[i] = arr[i];
            j++;
        }
    }
    printf("\nNew Array:\n"); 
    for(i = 0; i < count; i++) 
	{
        printf("%d\n", ptr[i]);
    }
   
}
