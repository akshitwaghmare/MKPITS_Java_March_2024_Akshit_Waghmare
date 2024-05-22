#include<stdio.h>
#include<stdlib.h>
struct node
{
    int num;
    struct node *next;
};

struct node *head = NULL;

int add(int n1, int n2);
void display(int sum);

int main() 
{
    int ch, num1, num2,sum;
    while(1)
    {
        printf("Enter choice:\n");
        printf("1. Add numbers\n");
        printf("2. Display sum\n");
        printf("3. Exit\n");
        scanf("%d", &ch);

        switch(ch)
        {
            case 1:
                printf("Enter first number: ");
                scanf("%d", &num1);
                printf("Enter second number: ");
                scanf("%d", &num2);
                break;
            case 2:
      			display(add(num1, num2));
				break;
            case 3:
                exit(0);
            default:
                printf("Invalid choice!\n");
        }
	}
}

int add(int n1, int n2)
{
	int sum;
    struct node *num1, *num2;
    num1 = (struct node*)malloc(sizeof(struct node));
    num2 = (struct node*)malloc(sizeof(struct node));
    num1->num = n1;
    num1->next = num2;
    num2->num = n2;
    num2->next = NULL;
    if (head == NULL)
    {
        head = num1;
    }
    else
    {
        struct node *ptr = head;
        while (ptr->next != NULL)
        {
            ptr = ptr->next;
        }
    	ptr->next = num1;
    }
    sum = n1+n2;
    return sum;
}

void display(int sum)
{
	if (sum != 0)
	{
		printf("Sum is %d\n", sum);
	}
    else
    {
    	printf("choose option 1\n");
	}
}