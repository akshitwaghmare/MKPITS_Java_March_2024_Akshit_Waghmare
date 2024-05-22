#include<stdio.h>
main()
{
	struct student
	{	
		char name[10];
		int marks;
		float fees;
	};
	struct student s = {'akshit',99,999.99};
	printf("%s \n",s.name);
	printf("%d \n", s.marks);
	printf("%f \n", s.fees);
}