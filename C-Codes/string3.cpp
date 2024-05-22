#include<stdio.h>
#include<conio.h>
main()
{
	char str[10],null=0,i,rev,ch,length=0;
	
	printf("Enter a string: ");
	scanf("%s", str);
	
	while(str[i] != null)
	{
		length++;
		i++;
	}
	printf("string in reverse order : \n");	
	for(i=length-1; i>=0; i--)
	{
		printf("%c \n",str[i]);
	}
}