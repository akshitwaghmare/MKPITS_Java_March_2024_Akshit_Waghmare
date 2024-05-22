#include<stdio.h>
main()
{
	int i,num[5],sum=0,average=0;
	printf("Enter array of 5:\n ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=1;i<6;i++)
	{
		sum = sum + num[i];
	}
	for(i=1;i<6;i++)
	{
		average = sum / 5;
	}
	printf("sum is %d \n",sum);
	printf("average is %d \n",average);
}