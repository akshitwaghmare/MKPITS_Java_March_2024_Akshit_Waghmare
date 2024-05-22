#include<stdio.h>
main()
{
	char str[10];
	int count=0,i=0;
	
	printf("Enter string: ");
	scanf("%s", str);
	
	while(str[i] !='\0')
	{
		if(str[i] == 'a' || str[i]== 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
		{
			count++;
		}
		i++;
	}
	printf("%d vowels are present", count);
}