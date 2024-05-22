#include<Stdio.h>
main()
{
    char str[10];
    int length=0, i,null=0,x=0;

    printf("Enter string: ");
    scanf("%s", str);
	
	while(str[i] != null)
	{
		length++;
		i++;
	}
	for (i = 0; i < length / 2; i++) 
	{
        if (str[i] == str[length - i - 1]) 
		{
            x=1;
            break;
        }
    }
    if(x==1)
    {
    	printf("Palindrome.");
	}
	else
	{
		printf("Not a Palindrome.");
	}
}
