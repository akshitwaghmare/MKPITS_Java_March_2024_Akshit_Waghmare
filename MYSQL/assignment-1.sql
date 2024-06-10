use sakila
#1
select * from film where rental_duration > 5;

#2
select * from customer_list where city = 'san diego';

#3
select * from film where rating = 'pg-13' order by title;

#4
select * from actor where last_name like 'a%' order by first_name;

#5
select * from film where release_year = '2006';

#6
select * from customer where first_name like 'john' order by last_name desc;

#7
select * from film where rental_rate between 2.99 and 4.99;

#8
select * from actor where last_name like '%son%' order by last_name;

#9
select * from store;

#10
select * from film where replacement_cost > 20 order by replacement_cost;

#11
select * from film where length > 120;

#12
select * from customer where active = '1';

#13
select * from film where rental_rate = '0.99' order by length desc;

#14
select * from actor where first_name = 'tom' order by last_name;

#15
select * from film where replacement_cost < 15 order by title;

#16
select * from customer where last_name like '%son';

#17
select * from film where rating = 'r' order by rental_duration;

#18
select * from actor where last_name = 'smith' order by first_name;

#19
select * from film where rental_duration = 7 order by replacement_cost;

#20
select * from customer where first_name like 'a%' order by last_name asc;

#21
select * from film where rental_duration between 3 and 7 and rental_rate > 2.99;

#22
select * from customer where address_id in (select address_id from address where city_id in (select city_id from city where city in ('new york', 'san diego')));

#23
select * from film where rating in ('pg', 'g') and length < 90;

#24
select * from actor where first_name like '%sam%' or last_name like 'b%';

#25
select * from film where replacement_cost between 15 and 25 order by title;

#26
select * from rental where return_date between '2005-05-01' and '2005-06-01' and select active from customer where active = '1'

#27
select * from film where rental_rate in (4.99, 3.99, 2.99);

#28
select * from actor where first_name like 'm%' and last_name like '%y';

#29
select * from film where release_year in (2005, 2006, 2007) order by release_year;

#30
select * from customer where first_name = 'emily' or last_name like '%lee%';return_date
