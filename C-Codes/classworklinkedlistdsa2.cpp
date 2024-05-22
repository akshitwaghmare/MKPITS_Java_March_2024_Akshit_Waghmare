#include<stdio.h>
#include<stdlib.h>

struct node
{
	int num;
	struct node *next;
};
struct node *head = NULL;

void insertbegin();
void insertlast();
void insertrandom();
void search();
void deletenum();
void display();

int main()
{
	int choice=0;
	while(choice != 7)
	{
		printf("\nChoose one option from the following list ...\n");
        printf("\n1.Insert in beginning\n2.Insert at last\n3.Random insert\n4.Search\n5.Delet number\n6.Display\n7.Exit");
        printf("\nEnter your choice?\n");
        scanf("%d", &choice);
        
        switch(choice) 
		{
            case 1:
                insertbegin();
                break;
            case 2:
                insertlast();
                break;
            case 3:
                insertrandom();
                break;
            case 4:
                search();
                break;
            case 5:
                deletenum();
                break;
            case 6:
                display();
                break;
            case 7:
            	exit(0);
            default:
                printf("Please enter valid choice..\n");
        }
	}
}

void insertbegin()
{
	struct node *ptr, *temp;
	int n;
	ptr = (struct node*)malloc(sizeof(struct node));
	if(ptr == NULL)
	{
		printf("Node is not created\n");
	}
	else
	{
		printf("Enter number to be inserted:- ");
		scanf("%d",&n);
		ptr->num = n;
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
            	ptr->next = head;
            	temp->next = ptr;
            	head = ptr;
        	}
		}
	}
}
void insertlast()
{
	struct node *ptr, *temp;
    int data;
    ptr = (struct node *)malloc(sizeof(struct node));
    if(ptr == NULL) 
	{
        printf("\nOVERFLOW\n");
    } 
	else 
	{
        printf("\nEnter number to be inserted :- ");
        scanf("%d", &data);
        ptr->num = data;
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
void insertrandom()
{
	int i,loc,item;
	struct node *ptr, *temp;
	ptr = (struct node *) malloc (sizeof(struct node));
	if(ptr == NULL)
	{
		printf("\nOVERFLOW");
	}
	else
	{
		printf("\nEnter element value: ");
		scanf("%d",&item);
		ptr->num = item;
		printf("\nEnter the location after which you want to insert ");
		scanf("\n%d",&loc);
		temp=head;
		for(i=1;i<loc;i++)
		{
			temp = temp->next;
			if(temp == NULL)
			{
				printf("\ncan't insert\n");
				return;
			}
		}
		ptr->next = temp ->next;
		temp->next = ptr;
		printf("\nNode inserted");
	}
	
}

void search()
{
	struct node *ptr;
    int num, flag = 0, i = 0;
    ptr = head;
    if(ptr == NULL) 
	{
        printf("\nEmpty List\n");
    } 
	else 
	{
        printf("\nEnter num which you want to search?\n");
        scanf("%d", &num);
        do 
		{
            if(ptr->num == num) 
			{
                printf("Item found at location %d\n", i + 1);
                flag = 1;
                break;
            }
            ptr = ptr->next;
            i++;
        } 
		while(ptr != head);
        if(flag == 0) 
		{
            printf("Item not found\n");
        }
    }
}

void deletenum()
{
	struct node *ptr, *temp;
    int num;

    if (head == NULL) 
	{
        printf("\nList is empty\n");
        return;
    }

    printf("\nEnter number to be deleted: ");
    scanf("%d", &num);

    if (head->num == num) 
	{
        ptr = head;
        while (ptr->next != head) 
		{
            ptr = ptr->next;
        }
        if (ptr == head) 
		{
            free(ptr);
            head = NULL;
            printf("\nNode deleted\n");
            return;
        }

        ptr->next = head->next;
        free(head);
        head = ptr->next;
        printf("\nNode deleted\n");
    } 
	else 
	{
        ptr = head;
        while (ptr->next != head && ptr->next->num != num) 
		{
            ptr = ptr->next;
        }

        if (ptr->next == head) 
		{
            printf("\nNumber not found\n");
        } 
		else 
		{
            temp = ptr->next;
            ptr->next = temp->next;
            free(temp);
            printf("\nNode deleted\n");
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
        printf("\n printing values:- \n");
        do 
		{
            printf("%d\n", ptr->num);
            ptr = ptr->next;
        } 
		while(ptr != head);
    }
}