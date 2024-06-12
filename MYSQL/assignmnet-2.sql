select * from film
#Assignment2
#1
select count(film_id) from film
#2
select avg(rental_rate) from film
#3
select count(*) from rental 
#4
select max(replacement_cost) from film
#5
select sum(amount) from payment
#6
select avg(length) from film
#7
select min(rental_duration) from film
#8
select count(distinct customer_id) from rental
#9
select avg(amount) from payment
#10
select count(*) from inventory
#11
select count(distinct)
#12
select max(amount) from payment
#13
select avg(length) from film where rating='PG'
#14
select * from payment
select count(payment_id) from payment where date(payment_date) between '2005-05-01' and '2005-05-31'
#15
select count(film_id) from film where rental_duration = '7'
#16
select avg(replacement_cost) from film where rental_rate = '2.99'