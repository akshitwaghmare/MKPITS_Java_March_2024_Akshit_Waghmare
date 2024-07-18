use sakila;
# Assignment - 9
#1. Find customers who rented a specific film:
#Retrieve the names of customers who rented the film with the title 'Inception'.
select  c.first_name, c.last_name from customer c where c.customer_id in 
(select r.customer_id from rental r where r.inventory_id in ( select i.inventory_id
from inventory i where i.film_id = (select f.film_id from film f where f.title = 'indian love')));
select * from film; 
#2. Find films rented by a specific customer:
#Retrieve the titles of films rented by a customer with a given customer_id.
select f.title from film f where f.film_id in (select i.film_id from inventory i where i.inventory_id in (select r.inventory_id from 
rental r where r.customer_id = (select c.customer_id from customer c where c.customer_id=250)));

#3. Find rental details for the most recent rental:
#Retrieve the rental details for the most recent rental transaction in the database.
select rental_id, rental_date, inventory_id, customer_id, return_date, staff_id
from rental where rental_date = (select max(rental_date) from rental);

#4. Find the average rental duration compared to the overall average:
#Compare the average rental duration of films in a specific category with the overall average rental duration.
select c.name as category_name, avg(datediff(r.return_date, r.rental_date)) as avg_rental_duration
from rental r join inventory i on r.inventory_id = i.inventory_id join film f on i.film_id = f.film_id
join film_category fc on f.film_id = fc.film_id join category c on fc.category_id = c.category_id
where c.name = 'Action';

#5. Find films with rental counts above average:
#Retrieve films with rental counts greater than the average number of rentals across all films.
#- Count film wise rental
#- Display films whose rental count is > avg rental count
select film_id, title, rental_count from (select f.film_id, f.title, count(r.rental_id) as rental_count from film f
join inventory i on f.film_id = i.film_id join rental r on i.inventory_id = r.inventory_id group by film_id, f.title) as film_rental_count
where rental_count>(select avg(film_rental_count.rental_count)from (select count(r.rental_id) as rental_count from film f 
join inventory i on f.film_id = i.film_id join rental r on i.inventory_id = r.inventory_id group by f.film_id) as film_rental_counts);

#6. Find customers who rented the same film as another customer:
#Identify customers who rented the same film as a specific customer (based on customer_id).
select c.customer_id from customer c ;
SELECT DISTINCT c2.customer_id, c2.first_name, c2.last_name
FROM rental r1
JOIN inventory i1 ON r1.inventory_id = i1.inventory_id
JOIN film f1 ON i1.film_id = f1.film_id
JOIN inventory i2 ON f1.film_id = i2.film_id
JOIN rental r2 ON i2.inventory_id = r2.inventory_id
JOIN customer c2 ON r2.customer_id = c2.customer_id
WHERE r1.customer_id = ? -- Replace ? with the specific customer_id
  AND r2.customer_id != r1.customer_id;
specific customer number 2 where csutomer id 2=621
#7. Find customers who have rented from both stores:
#Identify customers who have rented films from both store_id 1 and store_id 2.
SELECT DISTINCT c.customer_id, c.first_name, c.last_name
FROM customer c
JOIN rental r1 ON c.customer_id = r1.customer_id
JOIN inventory i1 ON r1.inventory_id = i1.inventory_id
JOIN store s1 ON i1.store_id = s1.store_id
WHERE s1.store_id = 1
  AND c.customer_id IN (
    SELECT r2.customer_id 
    FROM rental r2
    JOIN inventory i2 ON r2.inventory_id = i2.inventory_id
    JOIN store s2 ON i2.store_id = s2.store_id
    WHERE s2.store_id = 2
);

#8. Find actors who have appeared in the same film:
#Retrieve actors who have appeared in the same film as a specific actor (based on actor_id).
SELECT DISTINCT a2.actor_id, a2.first_name, a2.last_name
FROM actor a1
JOIN film_actor fa1 ON a1.actor_id = fa1.actor_id
JOIN film_actor fa2 ON fa1.film_id = fa2.film_id
JOIN actor a2 ON fa2.actor_id = a2.actor_id
WHERE a1.actor_id = ? -- Replace ? with the specific actor_id
  AND a2.actor_id != a1.actor_id;
inner query-get actors one film
#9. Find films rented by top-revenue customers:
#Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue.
-- Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue
SELECT DISTINCT f.title
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id IN (
    SELECT customer_id
    FROM (
        SELECT c.customer_id, SUM(p.amount) AS total_revenue
        FROM customer c
        JOIN rental r ON c.customer_id = r.customer_id
        JOIN payment p ON r.rental_id = p.rental_id
        GROUP BY c.customer_id
        ORDER BY total_revenue DESC
        LIMIT 10
    ) AS top_customers
);

#10. Find films that have not been rented:
#Retrieve titles of films that have not been rented by any customer.
SELECT f.title
FROM film f
LEFT JOIN inventory i ON f.film_id = i.film_id
LEFT JOIN rental r ON i.inventory_id = r.inventory_id
WHERE r.rental_id IS NULL;
