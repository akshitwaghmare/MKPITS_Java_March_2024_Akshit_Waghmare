#include<stdio.h>
main()
{
	int num[5],i,greatest=0;
	printf("Enter array of 5: \n ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
	}
	
	for(i=0;i<5;i++)
	{
        if (num[i] > greatest)
        {
        	greatest = num[i];
		}
    }
    printf("greater is %d", greatest);

	
}