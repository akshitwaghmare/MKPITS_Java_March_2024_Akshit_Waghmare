#include<stdio.h>
#include<conio.h>
main()
{
	int n,i,j;
	
	for(i=1;i<11;i++)
	{
		for(j=1;j<11;j++)
		{
			n=i*j;
			printf("%d \t",n);
		}
		printf("\n");
	}
}