#include<stdio.h>
#include<stdlib.h>
main()
{
	int n,*ptr,counteven=0,countodd=0;
	printf("Enter size of memory allocated: ");
	scanf("%d", &n);
	
	ptr = (int*) malloc(sizeof(int)*n);
	
	printf("Enter numbers: \n");
	
	for(int i=0; i<n; i++)
	{
		scanf("%d", ptr+i);
		if(*(ptr+i) % 2 == 0)
		counteven++;
		else
		countodd++;
	}
	printf("evencount is %d\n oddcount is %d",counteven,countodd);
}