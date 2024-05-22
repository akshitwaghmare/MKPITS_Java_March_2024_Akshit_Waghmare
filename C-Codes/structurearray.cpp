#include<stdio.h>
main()
{
	struct student
	{	
		char name[10];
		int marks;
		float fees;
	};
	struct student s[3];
	
    for (int i = 0; i < 3; i++) 
	{
        printf("Enter Name: ");
        scanf("%s", &s[i].name); 
        printf("Enter marks: ");
        scanf("%d", &s[i].marks); 
        printf("Enter fees: ");
        scanf("%f", &s[i].fees);
        printf("\n");
    }
    
	for (int i = 0; i < 3; i++) 
	{
		printf("Details of student %d \n", i+1);
        printf("%s \n", s[i].name);
		printf("%d \n", s[i].marks);
		printf("%f \n", s[i].fees);
    }
}