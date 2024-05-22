#include <stdio.h>

int main() {
    int arr[10], n, i;
    
    printf("Enter Numbers:\n");
    for (i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);
    }
    
    printf("Array 2:\n");
    for (i = 0; i < 10; i++) {
        n = arr[i] % 10; // This line was incorrect in your code
        arr[i] = n;
        printf("%d\n", arr[i]);
    }
}
