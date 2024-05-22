#include<stdio.h>
#include<conio.h>
main()
{
	int d1,m1,y1,d2,m2,y2,d,m,y;
	
	printf("Enter date1\n Enter date:");
	scanf("%d", &d1);
	
	printf("Enter month: \n");
	scanf("%d", &m1);
	
	printf("Enter year: \n");
	scanf("%d", &y1);
	
	printf("Enter date2 \n");
	
	printf("day: ");
	scanf("%d", &d2);
	
	printf("Enter month: \n");
	scanf("%d", & m2);
	
	printf("Enter year: \n");
	scanf("%d", &y2);
	
	d = d2 - d1;
	m = m2 - m1;
	y = y2 - y1;
	
	if (d < 0)
	{
		d = d + 30;
		m = m2 - m1;
		y = y2 - y1;
		printf("%d year %d month %d day", y, m, d);
	}
	if (m < 0)
	{
		
		d = d2 - d1;
		m = m + 12;
		y = y2 - y1;
		printf("%d year %d month %d day", y, m, d);	
	}
	if (d < 0 && m < 0) 
	{
		d = d + 30;
		m = m + 12;
		y = y2 - y1;
		printf("%d year %d month %d day", y, m, d);    
	}
}