#include<stdio.h>

int main() 
{
    int arr[5], temp, i, j, sum = 0;

    printf("Enter elements:\n");
    for(i = 0; i < 5; i++) 
	{
        scanf("%d", &arr[i]);
    }

    for(i = 0; i < 5; i++) 
	{
        for(j = i + 1; j < 5; j++) 
		{
            if(arr[i] < arr[j]) 
			{
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(i = 0; i < 4; i++) 
	{
        sum = sum + arr[i];
    }
    printf("Maximum sum of four numbers: %d\n", sum);
    
}