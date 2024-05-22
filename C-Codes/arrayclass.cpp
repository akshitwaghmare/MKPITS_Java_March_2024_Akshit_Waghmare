#include <stdio.h>

int main() 
{
    int arr[10], i, j, k ,count=1,x;
    
    printf("Enter Numbers: \n");
    for(i = 0; i < 10; i++) 
	{
        scanf("%d", &arr[i]);
    }
    
    for(i = 0; i < 10; i++) 
	{
		count=0;
        for(j = i + 1; j < 10; j++) 
		{
            if(arr[i] == arr[j]) 
			{
                count++;
            }
        }
        x=0;
    	for(k=0; k<i; k++)
    	{
			if(arr[i] == arr[k])
    		{	
    			x=1;
    			break;
			}
		}
		count = count + 1;
		if(x!=1)
		{
			printf("%d is %d times\n",arr[i],count);
		}
    }
}