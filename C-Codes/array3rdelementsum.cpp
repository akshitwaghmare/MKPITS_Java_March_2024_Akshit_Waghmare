#include<stdio.h>
main()
{
	int arr[12],num,sum=0;
	printf("Enter elements:\n");
	for(int i=0; i<12; i++)
	{
		scanf("%d",&arr[i]);
		if((i+1) % 3 == 0)
		{
			sum = sum + arr[i];
		}
	}
	printf("sum is %d",sum);
	
}