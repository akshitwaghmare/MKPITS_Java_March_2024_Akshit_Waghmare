#include <stdio.h>

void remove_duplicates(int arr[], int n) {
    if (n==0 || n==1)
        return;

    int temp[n];
    int j = 0;
    int i;

    for (i=0; i<n-1; i++)
        if (arr[i] != arr[i+1])
            temp[j++] = arr[i];

    temp[j++] = arr[n-1];

    for (i=0; i<j; i++)
        arr[i] = temp[i];
}

int main() {
    int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    remove_duplicates(arr, n);

    printf("Array after removing duplicates : ");
    for (int i=0; i<n; i++)
        printf("%d ", arr[i]);

    return 0;
}
