#include <stdio.h>
#include <stdlib.h>

struct Stack 
{
    int top;
    int array[10];
};

struct Stack* createStack() 
{
    struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->top = -1;
    return stack;
}

void push(struct Stack* stack, int num);
int pop(struct Stack* stack);
void display(struct Stack* stack);

int main() 
{
    struct Stack* stack = createStack();
    int choice, element;
    while (1) {
        printf("\n1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) 
		{
        case 1:
            printf("Enter element to push: ");
            scanf("%d", &element);
            push(stack, element);
            break;
        case 2:
            printf("Popped element: %d\n", pop(stack));
            break;
        case 3:
            display(stack);
            break;
        case 4:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }

    return 0;
}

void push(struct Stack* stack, int num) 
{
    stack->array[++stack->top] = num;
}

int pop(struct Stack* stack) 
{    
    return stack->array[stack->top--];
}

void display(struct Stack* stack) 
{
     printf("Stack elements:\n");
    for (int i = stack->top; i >= 0; i--) 
	{
        printf("%d\n", stack->array[i]);
    }
}
