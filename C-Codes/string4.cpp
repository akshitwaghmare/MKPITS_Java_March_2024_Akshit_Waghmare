#include<Stdio.h>
main()
{
	char str1[10],str2[10],null=0;
	int length1=0,length2=0,i;
	printf("Enter string1:");
	scanf("%s", str1);
	
	printf("Enter a string2:");
	scanf("%s", str2);
	
	while(str1[i] != null)
	{
		length1++;
		i++;
	}
	i=0;
	while(str2[i] != null)
	{
		length2++;
		i++;
	}
	if (length1 == length2 )
	{
		for(i=0; i<length1; i++)
		{
			if(str1[i]==str2[i])
			{
				continue;
			}
			else 
			{
				break;
			}
		}
		if(i==length1)
		{
			printf("Strings are same");
		}
		else
		{
			printf("Strings are not same");
		}
	}
	else
	{
		printf("Length of String are not same");
	}
}