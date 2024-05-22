#include<stdio.h>
main()
{
	int num[5],i,counteven=0,countodd=0;
	printf("Enter array of 5: \n ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=0;i<5;i++)
	{
		if(num[i] % 2 == 0)
		counteven++;
		else
		countodd++;
	}
	printf("evencount is %d\n oddcount is %d",counteven,countodd);
		
}