#include<stdio.h>
main()
{
    int arr[10], i, j, count, x;
    int arr2[10] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    
    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
    {
        scanf("%d", &arr[i]);
    }
    
    for(i = 0; i < 10; i++) 
    {
            count = 1;
            for(j = i + 1; j < 10; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    count++;
                    arr2[j] = 0;
                }
                if(arr2[i] != 0)
                {
                	arr2[i]=count;
				}
            }
        }
    for(i = 0; i < 10; i++)
    {
        if (arr2[i]!=0)
        {
            printf("%d occurs %d times\n", arr[i], arr2[i]);
        }
    }
}