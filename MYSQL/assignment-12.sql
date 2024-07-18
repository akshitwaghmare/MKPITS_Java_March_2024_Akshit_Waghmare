use sakila
### Problem Statement 1
#**Create a view named `customer_rental_info` that lists each customer's full name (first and last),
# email, the number of rentals they have made, and the total amount they have spent on rentals.**

create view customer_rental_info
as
select c.first_name,c.last_name,c.email,count(r.rental_id) as 'Total Rentals',sum(p.amount) as 'Total Amount' from customer c
join rental r on r.customer_id = c.customer_id
join payment p on p.rental_id = r.rental_id group by c.first_name,c.last_name,c.email,c.customer_id

select * from customer_rental_info

#2.Create a view named `top_rented_films` that displays the top 10 most rented films, 
# including the film title and the number of times it has been rented.**
create view top_rented_films
as
select f.title,count(r.rental_id) as counter from film f
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id group by f.title order by counter desc limit 10

#3.*Create a view named `active_customers` that lists all customers who have rented at least one film in the last 30 days.
#Include the customer's full name, email, and the date of their last rental.**

create view active_customer
as
select c.first_name,c.last_name,c.email,r.rental_date, max(r.return_date) from customer c
where 
join rental r on r.customer_id = c.customer_id group by c.first_name,c.last_name having day(r.rental_date) <= 30

#4 Create a view named `inventory_by_store` that displays the number of films available in each store.
# Include the store ID and the count of films available in that store.

create view inventory_by_store
as
select s.store_id,count(f.film_id) from store s
join inventory i on i.store_id = s.store_id
join film f on f.film_id = i.film_id group by s.store_id 

#5.Create a view named `staff_sales_performance` that lists each staff member's full name, 
# their store, and the total sales amount they have made.**

create view staff_sales_performance
as
select s.first_name,s.last_name,s.store_id,sum(p.amount) from staff s
join payment p on p.staff_id = s.staff_id group by s.first_name,s.last_name,s.store_id

