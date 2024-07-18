use sakila

#1. Problem Statement 1: Retrieve Customer Information with Rental History
#Retrieve the customer's first name, last name, and the number of rentals they have made. 
#Include customers who have not made any rentals as well.

select c.first_name,c.last_name,count(r.rental_id) from customer c
left join rental r on r.customer_id = c.customer_id group by  c.first_name,c.last_name order by count(r.rental_id)

#Problem Statement 2: Display Films and Their Rental Count
#Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.

select f.title,count(r.rental_id) from film f
left join inventory i on f.film_id=i.film_id 
left join rental r on r.inventory_id=i.inventory_id  group by f.title order by count(r.rental_id)
	
#3.Problem Statement 3: List Customers and Their Rentals
#List customers with their rental details (rental ID, rental date, and return date if available). 
# Include customers who have not made any rentals.

select c.first_name,c.last_name,r.rental_id,r.rental_date,r.return_date from customer c
left join rental r on r.customer_id=c.customer_id group by c.first_name,c.last_name order by r.rental_date

#Problem Statement 4: Show Films and Customers Who Rented Them
#Display film titles and the names of customers who have rented each film. Include films that have not been rented.

select f.title,c.first_name,c.last_name from film f 
left join  inventory i on f.film_id=i.film_id 
left join rental r on r.inventory_id=i.inventory_id 
left join customer c on c.customer_id=r.customer_id group by f.title,c.first_name,c.last_name 


#Problem Statement 5: Explore Rental Returns and Late Fees
#Retrieve rental ID, return date, and any associated late fees. Include rentals that have not been returned yet, 
#displaying a NULL return date for these rentals.

select r.rental_id, r.return_date from rental r 

#Problem Statement 6: Retrieve Films and Rental Details
#Retrieve film titles and rental details (rental ID, rental date, and return date if available). Include films that have not been rented.

select f.title,r.rental_id,r.rental_date,r.return_date from film f
left join  inventory i on f.film_id=i.film_id 
left join rental r on r.inventory_id=i.inventory_id group by f.title,r.rental_id,r.rental_date,r.return_date

#Problem Statement 7: Display Rentals and Associated Customers
#Display rental details (rental ID, rental date, and return date if available) along with the names of customers who made those rentals. 
#Include rentals that have not been rented.
select c.first_name,c.last_name, r.rental_id,r.rental_date,r.return_date from rental r
left join customer c on r.customer_id = c.customer_id 

#Problem Statement 8: List Payments with Customer Information
# List payment details (payment ID, amount, and payment date) along with the names of customers who made those payments.
# Include payments that have not been made.
select c.first_name,c.last_name,p.payment_id,p.amount,p.payment_date from payment p 
right join customer c on p.customer_id = c.customer_id 

#Problem Statement 9: Show Actors and Films They Acted In
#Display actor names and the titles of films they have acted in. Include actors who have not acted in any films.
select f.title,a.first_name,a.last_name from actor a
left join film_actor fa on fa.actor_id = a.actor_id 
left join film f on f.film_id = fa.film_id
