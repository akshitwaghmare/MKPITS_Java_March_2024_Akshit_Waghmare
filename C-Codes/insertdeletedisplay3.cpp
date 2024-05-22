#include <stdio.h>

void deletenum(int arr[], int position);
void insertnum(int arr[], int *size, int position, int value);
void display(int arr[], int size);

int main() 
{
    int arr[10], size, ch, position, value;
    
    printf("Enter size of array:\n");
    scanf("%d", &size);
    
    printf("Enter Elements:\n");
    for(int i = 0; i < size; i++) 
    {
        scanf("%d", &arr[i]);
    }
    do 
    {
        printf("\n1. Delete Element\n");
        printf("2. Insert Element\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        scanf("%d", &ch);
        
        switch(ch) 
        {
            case 1:
                printf("Enter position to delete:\n");
                scanf("%d", &position);
                deletenum(arr, position);
                display(arr, size);
                break;
                
            case 2:
                printf("Enter position to insert:\n");
                scanf("%d", &position);
                printf("Enter value to insert:\n");
                scanf("%d", &value);
                insertnum(arr, &size, position, value);
                display(arr, size);
                break;
                
            case 3:
                display(arr, size);
                break;
                
            case 4:
                printf("Exiting...\n");
                break;
                
            default:
                printf("Invalid choice\n");
        }
    } while(ch != 4);
    
    return 0;
}

void deletenum(int arr[], int position) 
{ 
    arr[position] = 0;
}

void insertnum(int arr[], int *size, int position, int value) 
{
  
    (*size)++;
    for (int i = *size - 1; i > position; i--) 
	{
        arr[i] = arr[i - 1];
    }
    arr[position] = value;
}

void display(int arr[], int size) 
{
    printf("Array: ");
    for(int i = 0; i < size; i++) 
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
