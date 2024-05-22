#include<stdio.h>
main()
{
	int num[5],i,smallest=0;
	printf("Enter array of 5: \n ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
	}
	
	smallest=num[0];
	
	for(i=1;i<5;i++)
	{
        if (num[i] < smallest)
        {
        	smallest = num[i];
		}
    }
    printf("smallest number is %d", smallest);	
}