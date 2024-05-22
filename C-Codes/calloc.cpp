#include<stdio.h>
#include<stdlib.h>
main()
{
	int n,*ptr,sum=0,average=0;
	printf("Enter size of memory allocated: ");
	scanf("%d", &n);
	
	ptr = (int*) calloc(sizeof(int),n);
	printf("Enter numbers: ");
	for(int i=0; i<n; i++)
	{
		scanf("%d", ptr+i);
		sum = sum + *(ptr+i);
	}
	average = sum/n;
	printf("sum is %d \naverage is %d ",sum,average);
}