#include<stdio.h>
main()
{
	int sumeven=0,sumodd=0,arr[10];
	
	printf("Enter elements:\n");
	for(int i=0; i<10; i++)
	{
		scanf("%d", &arr[i]);
		if(arr[i] % 2 == 0)
		{
			sumeven = sumeven + arr[i];
		}
		else
		{
			sumodd = sumodd + arr[i];
		}
	}
	printf("Sum of even is %d\n",sumeven);
	printf("Sum of odd is %d",sumodd);
	
}