#include<stdio.h>
main()
{
	char str1[10],str2[10];
    int length=0, i,null=0,j,pallindrome=0;

    printf("Enter string: ");
    scanf("%s", str1);
	
	while(str1[length] != '\0')
	{
		length++;
	}
	
	for(i=length-1,j=0; i>=0 ;i--,j++)
	{
		 str2[j] = str1[i];
	}
	str2[j]='\0';
	for (i = 0; i < length; i++) 
	{
		if (str1[i] != str2[i]) 
		{
			pallindrome = 1;
			break;
		}
	}
	if(pallindrome == 0)
	{
		printf("STRING IS PALLINDROME");
	}
	else
	{
		printf("NOT A PALLINDOME");
	}
}