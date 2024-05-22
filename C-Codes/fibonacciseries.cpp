#include <stdio.h>

void fibonacci(int n, int fib[]);

int main() 
{
    int n;
    printf("Enter the number of Fibonacci numbers to generate: ");
    scanf("%d", &n);

    int fib[n+1];
    fibonacci(n, fib);

    printf("Fibonacci numbers up to position %d are: ", n);
    for (int i = 0; i <= n; i++) 
	{
        printf("%d ", fib[i]);
    }
}
void fibonacci(int n, int fib[])
{
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <= n; i++) 
	{
        fib[i] = fib[i-1] + fib[i-2];
    }
}
