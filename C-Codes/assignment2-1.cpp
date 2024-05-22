#include<stdio.h>
int countdigits(int num);

int main() 
{
    int num,digits;
    
    printf("Enter number: ");
    scanf("%d", &num);
    
    digits = countdigits(num);
    
    printf("Number of digits in %d is %d", num, digits);
    
}
int countdigits(int num)
{
	int count = 0;
    
    while (num != 0) 
	{
        num = num / 10; 
        count++;
    }
    
    return count;
}