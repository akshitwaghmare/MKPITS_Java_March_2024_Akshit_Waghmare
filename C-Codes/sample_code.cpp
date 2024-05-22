#include<stdio.h>
#include<conio.h>
void insertion_specified() {
    int loc, i = 1;
    printf("Enter the location: ");
    scanf("%d", &loc);

    if (loc <= 0) {
        printf("\nInvalid location.\n");
        return;
    }

    if (loc == 1) {
        insertion_beginning();
        return;
    }

    struct node *temp = head;
    while (i < loc && temp != NULL) {
        temp = temp->next;
        i++;
    }

    if (temp == NULL) {
        printf("\nThere are less than %d elements.\n", loc);
        return;
    }

    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("\nMemory allocation failed. Overflow\n");
        return;
    }

    int item;
    printf("Enter value: ");
    scanf("%d", &item);

    ptr->data = item;
    ptr->prev = temp;
    ptr->next = temp->next;

    if (temp->next != NULL)
        temp->next->prev = ptr;

    temp->next = ptr;

    printf("\nNode inserted\n");
}
