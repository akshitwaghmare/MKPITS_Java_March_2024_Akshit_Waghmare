#include<stdio.h>
#include<conio.h>
main()
{
	char str[10],null=0,length=0,i;
	
	printf("Enter a string:");
	scanf("%s", str);
	
	while(str[i] != null)
	{
		length++;
		i++;
	}
	printf("%d", length);
}