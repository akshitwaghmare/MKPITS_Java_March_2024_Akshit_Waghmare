#include<stdio.h>
main()
{
	int rev,num[5],i;
	printf("Enter array of 5: ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=0;i<5;i++)
	{
		rev = -(i) + 5;
		printf("%d \n", rev);
	}
}