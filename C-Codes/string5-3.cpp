#include<stdio.h>
#include<string.h>
main()
{
	char str1[10],str2[10];
    int L, i,null=0,j,pallindrome=0;

    printf("Enter string: ");
    scanf("%s", str1);
	
	L = strlen(str1);
		
	for(i=L-1,j=0; i>=0 ;i--,j++)
	{
		 str2[j] = str1[i];
	}
	str2[j]='\0';
	
	if(strcmp(str1,str2)==0)
	{
		printf("STRING IS PALLINDROME");
	}
	else
	{
		printf("NOT A PALLINDOME");
	}
}