#include <stdio.h>
#include <time.h>

int main() {
    time_t t1, t2;
    char dateFormat1[30], dateFormat2[30];
    int difference;

    // Get the current time
    time(&t1);

    // Convert the current time to a string in a specific format
    strftime(dateFormat1, 30, "%Y-%m-%d", localtime(&t1));

    // Input the second date
    printf("Enter the second date (YYYY-MM-DD): ");
    scanf("%s", dateFormat2);

    // Convert the second date string to time_t format
    strftime(dateFormat2, "%Y-%m-%d", &t2);

    // Calculate the difference in seconds
    difference = difftime(t1, t2);

    // Convert the difference in seconds to days
    difference = difference / 86400;

    printf("The difference between the two dates is %d days.\n", difference);

    return 0;
}