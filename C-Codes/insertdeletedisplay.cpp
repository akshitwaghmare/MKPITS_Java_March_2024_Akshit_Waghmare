#include <stdio.h>

void deletenum(int arr[], int *size, int position);
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
    
    printf("1. Delete Element\n");
    printf("2. Insert Element\n");
    printf("3. Display\n");
    scanf("%d", &ch);

	switch(ch) 
    {
        case 1:
            printf("Enter position to delete:\n");
            scanf("%d", &position);
            deletenum(arr, &size, position);
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
            
        default:
            printf("Invalid choice\n");
    }
}

void deletenum(int arr[], int size, int position) 
{ 
    for(int i = position; i < size - 1; i++) 
    {
        arr[i] = arr[i + 1];
    }
    size--;
}

void insertnum(int arr[], int size, int position, int value) 
{
    for(int i = size - 1; i >= position; i--) 
    {
        arr[i + 1] = arr[i];
    }
    arr[position] = value;
    size++;
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
