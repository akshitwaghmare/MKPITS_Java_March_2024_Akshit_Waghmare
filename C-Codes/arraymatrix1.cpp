#include<stdio.h>
main()
{
	int num[3][3] = {
						{32,24,26},
						{25,26,27},
						{35,36,37},
					};
					
	for (int i = 0; i < 3; i++) 
	{
        for (int j = 0; j < 3; j++) 
		{
            printf("%d ", num[i][j]);
        }
        printf("\n");
    }
}