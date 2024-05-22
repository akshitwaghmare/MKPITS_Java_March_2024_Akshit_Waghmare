#include <stdio.h>

void generateSubsets(int arr[], int n);

int main() {
    int arr[] = {1, 2, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    generateSubsets(arr, n);
    return 0;
}

void generateSubsets(int arr[], int n) {
    for (int i = 0; i < (1 << n); i++) {
        for (int j = 0; j < n; j++) {
            if (i & (1 << j)) {
                printf("%d ", arr[j]);
            }
        }
        printf("\n");
    }
}