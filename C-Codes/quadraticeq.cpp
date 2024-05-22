#include <stdio.h>
#include <math.h>

int main() {
    float a, b, c, discriminant, x1, x2, realPart, imaginaryPart;
    
    printf("Enter coefficients a, b, and c: ");
    scanf("%f %f %f", &a, &b, &c);
    
    discriminant = b * b - 4 * a * c;

    if (discriminant > 0) 
	{
        x1 = (-b + sqrt(discriminant)) / (2 * a);
        x2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("Roots are real and distinct: %.2f and %.2f\n", x1, x2);
    } 
	else if (discriminant == 0) 
	{
        x1 = x2 = -b / (2 * a);
        printf("Roots are real and identical: %.2f and %.2f\n", x1, x2);
    } 
	else 
	{
        realPart = -b / (2 * a);
        imaginaryPart = sqrt(-discriminant) / (2 * a);
        printf("Roots are complex: %.2f + %.2fi and %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
    }

    return 0;
}
