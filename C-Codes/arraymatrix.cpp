#include<stdio.h>
main()
{
	int num1[3][3],num2[3][3],sum[3][3];
	
	printf("Enter array1: \n");
	for (int i = 0; i < 3; i++) 
	{
        for (int j = 0; j < 3; j++) 
		{
            scanf("%d", &num1[i][j]);
        }
    }
	printf("Enter array2: \n");
	for (int i = 0; i < 3; i++) 
	{
        for (int j = 0; j < 3; j++) 
		{
            scanf("%d", &num2[i][j]);
        }
    }	
    for (int i = 0; i < 3; i++) 
	{
        for (int j = 0; j < 3; j++) 
		{
            sum[i][j] = num1[i][j] * num2[i][j];
        }
    }	
						
	for (int i = 0; i < 3; i++) 
	{
        for (int j = 0; j < 3; j++) 
		{
            printf("%d ", sum[i][j]);
        }
        printf("\n");
    }
}
