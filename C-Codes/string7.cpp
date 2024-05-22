#include<stdio.h>
#include<string.h>

main()
{
	char str[5][10],temp[10];
	
	for(int i=0; i<5; i++)
	{
		printf("Enter Name %d: ", i+1);
		scanf("%s",str[i]);
	}
	
	for(int i = 0; i < 5-1; i++)
    {
        for(int j = 0; j < 5-i-1; j++)
        {
            if(strcmp(str[j], str[j+1]) > 0)
            {
                strcpy(temp, str[j]);
                strcpy(str[j], str[j+1]);
                strcpy(str[j+1], temp);
            }
        }
    }
	for(int i=0; i<5; i++)
	{
		printf("%s", str[i]);
		printf("\n");
	}
}