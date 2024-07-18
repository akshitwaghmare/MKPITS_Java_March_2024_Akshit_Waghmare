#Assignment 8 having clause
use sakila
#1. High revenue categories:
#Find categories with an average rental revenue greater than $10.
select c.category_id as category_name , avg(p.amount) as rental_revenue
from category c  
join film_category fc on c.category_id = fc.category_id
join film f on fc.film_id = f.film_id
join inventory i on f.film_id = i.film_id
join rental  r on i.inventory_id = r.inventory_id
join payment p on r.rental_id = p.rental_id
group by c.category_id
having avg(p.amount) > 10


#2Customers with many rentals:
#Identify customers who have rented more than 30 films.
select c.customer_id,count(f.film_id) as total
from customer c
join rental r on r.customer_id=c.customer_id
join inventory i on r.inventory_id=i.inventory_id
join film f on f.film_id=i.film_id
group by c.customer_id
having total>30

#3. Popular languages:
#List languages with more than 50 films.
select l.name , l.language_id, count(f.film_id)
from language l
join film f on l.language_id = f.language_id
group by l.language_id
having count(film_id) > 50
order by film_id;


#4.Stores with high revenue:
#Find stores with total revenue exceeding $5000.
select s.store_id, sum(p.amount) as amount from
store s join inventory i on s.store_id=i.store_id
join rental r on i.inventory_id=r.inventory_id
join payment p on r.rental_id=p.rental_id
group by s.store_id
having amount>5000

#5. Actors in popular films:
#Show actors who have appeared in more than 10 films.
select a.first_name, a.actor_id, count(f.film_id) 
from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
group by a.actor_id
having count(f.film_id) > 10
order by f.film_id;


#6. Staff with high customer interactions:
#List staff members who have handled more than 500 customer transactions.
select  s.staff_id, CONCAT(s.first_name, ' ', s.last_name) AS staff_name  ,count(p.customer_id) as customer_transaction
from staff s
join payment p on s.staff_id = p.staff_id
group by staff_id
having count(p.customer_id) > 500
order by staff_id;

#8Long rentals:
#List films with an average rental duration of more than 7 days.
select title,avg(rental_duration) as total 
from film 
group by title 
having total>7

#Highly rented films:
#9Identify films that have been rented more than 30 times.
select f.film_id , count(r.rental_id) totalrented
from film f 
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
group by f.film_id
having totalrented>30

#10. Customers with diverse film preferences:
#Find customers who have rented films from at least 5 different categories.
select c.customer_id,c.first_name, count(r.name) as category from 
customer c join rental r on c.customer_id=r.customer_id
group by  c.customer_id
having category>=5