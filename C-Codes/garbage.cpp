#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *next;
};

struct node *head = NULL;

void beginsert();
void lastinsert();
void begin_delete();
void last_delete();
void search();
void display();

int main() {
    int choice = 0;
    while(choice != 7) 
	{
        printf("\n*********Main Menu*********\n");
        printf("\nChoose one option from the following list ...\n");
        printf("\n1.Insert in beginning\n2.Insert at last\n3.Delete from Beginning\n4.Delete from last\n5.Search for an element\n6.Show\n7.Exit\n");
        printf("\nEnter your choice?\n");
        scanf("%d", &choice);
        switch(choice) 
		{
            case 1:
                beginsert();
                break;
            case 2:
                lastinsert();
                break;
            case 3:
                begin_delete();
                break;
            case 4:
                last_delete();
                break;
            case 5:
                search();
                break;
            case 6:
                display();
                break;
            case 7:
                exit(0);
                break;
            default:
                printf("Please enter valid choice..\n");
        }
    }
    return 0;
}

void beginsert() 
{
    struct node *ptr, *temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if(ptr == NULL) 
	{
        printf("\nOVERFLOW\n");
    } 
	else 
	{
        printf("\nEnter the node data?\n");
        scanf("%d", &item);
        ptr->data = item;
        if(head == NULL) 
		{
            head = ptr;
            ptr->next = head;
        } 
		else 
		{
            temp = head;
            while(temp->next != head)
                temp = temp->next;
            ptr->next = head;
            temp->next = ptr;
            head = ptr;
        }
        printf("\nnode inserted\n");
    }
}

void lastinsert() 
{
    struct node *ptr, *temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if(ptr == NULL) 
	{
        printf("\nOVERFLOW\n");
    } 
	else 
	{
        printf("\nEnter Data?");
        scanf("%d", &item);
        ptr->data = item;
        if(head == NULL) 
		{
            head = ptr;
            ptr->next = head;
        } 
		else 
		{
            temp = head;
            while(temp->next != head) 
			{
                temp = temp->next;
            }
            temp->next = ptr;
            ptr->next = head;
        }
        printf("\nnode inserted\n");
    }
}

void begin_delete() 
{
    struct node *ptr, *temp;
    if(head == NULL) 
	{
        printf("\nUNDERFLOW\n");
    } 
	else if(head->next == head) 
	{
        head = NULL;
        free(head);
        printf("\nnode deleted\n");
    } 
	else 
	{
        ptr = head;
        while(ptr->next != head)
            ptr = ptr->next;
        temp = head;
        ptr->next = temp->next;
        head = temp->next;
        free(temp);
        printf("\nnode deleted\n");
    }
}

void last_delete() 
{
    struct node *ptr, *preptr;
    if(head == NULL) 
	{
        printf("\nUNDERFLOW\n");
    } 
	else if(head->next == head) 
	{
        head = NULL;
        free(head);
        printf("\nnode deleted\n");
    } 
	else 
	{
        ptr = head;
        while(ptr->next != head) 
		{
            preptr = ptr;
            ptr = ptr->next;
        }
        preptr->next = ptr->next;
        free(ptr);
        printf("\nnode deleted\n");
    }
}

void search() 
{
    struct node *ptr;
    int item, flag = 0, i = 0;
    ptr = head;
    if(ptr == NULL) 
	{
        printf("\nEmpty List\n");
    } 
	else 
	{
        printf("\nEnter item which you want to search?\n");
        scanf("%d", &item);
        do 
		{
            if(ptr->data == item) 
			{
                printf("Item found at location %d\n", i + 1);
                flag = 1;
                break;
            }
            ptr = ptr->next;
            i++;
        } 
		while(ptr != head);
        if(flag == 0) {
            printf("Item not found\n");
        }
    }
}

void display() 
{	
    struct node *ptr;
    ptr = head;
    if(ptr == NULL) 
	{
        printf("\nnothing to print");
    } 
	else 
	{
        printf("\n printing values ... \n");
        do 
		{
            printf("%d\n", ptr->data);
            ptr = ptr->next;
        } 
		while(ptr != head);
    }
}