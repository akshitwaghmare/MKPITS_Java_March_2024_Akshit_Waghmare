#include <stdio.h>
#include <math.h>

int main() 
{
    int num, root;

    printf("Enter a number: ");
    scanf("%d", &num);

    root = sqrt(num);

    if (int (root) == root )
        printf("it is a perfect square.\n", num);
    else
        printf("it is not a perfect square.\n", num);

    return 0;
} 