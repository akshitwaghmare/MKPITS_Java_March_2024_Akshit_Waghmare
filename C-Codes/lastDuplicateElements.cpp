#include <stdio.h>

int main() {
    int arr[10], i, j, lastduplicate = 0;

    printf("Enter Numbers: \n");
    for (i = 0; i < 10; i++) 
	{
        scanf("%d", &arr[i]);
    }
    
    for (i = 0; i < 10; i++) 
	{
        for (j = i + 1; j < 10; j++) 
		{
            if (arr[i] == arr[j]) 
			{
                lastduplicate = arr[i];
            }
        }
    }

    if (lastduplicate != 0)
	{
        printf("Last duplicate Element: %d\n", lastduplicate);
    } 
	else
	{
        printf("No duplicate element found.\n");
    }

    return 0;
}
