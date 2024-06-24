use sakila
select * from film
select * from customer
select * from rental
select * from inventory
select * from actor
select * from film_actor
#1.Retrieve the names of all customers and the titles of the films they have rented
select c.first_name,c.last_name,title from customer c 
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
order by title,first_name desc
#2 Display the rental date and return date for each rental along with the first name and last name.
select c.first_name,c.last_name,r.rental_date,r.return_date from customer c join rental r on c.customer_id = r.customer_id
#3List the names of actors who have appeared in the film titled Chamber Italian
select a.first_name,a.last_name from actor a 
join film_actor fa on a.actor_id = fa.actor_id 
join film f on f.film_id = fa.film_id where f.title = 'Chamber italian'
#4Get the titles of all films rented by the customer named William Brown.
select f.title from film f 
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where first_name = 'william' and last_name = 'brown'
#5 Retrieve the film titles rented by the customer with customer_id 100.
select f.title from film f 
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.customer_id = 100
#6List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select f.title,rental_date from film f 
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.customer_id = 200
#7 Display the film titles and rental durations for all rentals made on May 15,2005.
select f.title, rental_duration from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id where date(rental_date) = '2005-05-15'
#8 List the names of customers who have rented the film titled "Alien Center"
select c.first_name,c.last_name from customer c 
join rental r on c.customer_id = r.customer_id 
join inventory i on i.inventory_id = r.inventory_id 
join film f on f.film_id = i.film_id where f.title = 'Alien Center'

#9.Display the first name, last name, and email of customers who have rented the film titled Flight Lies
select c.first_name,c.last_name,c.email from customer c
join rental r on c.customer_id = r.customer_id 
join inventory i on i.inventory_id = r.inventory_id 
join film f on f.film_id = i.film_id where f.title = 'Flight Lies'

#10.Retrieve the rental date and rental duration for each rental made by customer Linda Williams
select r.rental_date,rental_duration from rental r
join customer c on c.customer_id = r.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where first_name = 'Linda' and last_name ='Williams'

#11.List the film titles and rental dates for all rentals made by customer Mary Johnson
select f.title,rental_date from rental r
join customer c on c.customer_id = r.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where first_name = 'Mary' and last_name = 'Smith'

#12.Display the film titles rented by the customer with customer_id 300.
select f.title from film f 
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.customer_id = 300

#13.Get the names of all customers who have rented more than 5 films.
select c.first_name,c.last_name from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id group by c.first_name,c.last_name having count(c.customer_id) > 5 

#14.List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select f.title,r.rental_date from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where c.customer_id = 400

#15.Retrieve the rental date and return date for each rental made by customer Richard Davis;.
select r.rental_date,r.return_date from  rental r
join customer c on c.customer_id = r.customer_id where c.first_name = 'Richard' and c.last_name = 'Davis'

#16.Display the first name, last name, and email of customers who have ented the film titled Dinosaur Secretary
select c.first_name,c.last_name,c.email from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where f.title = 'Dinosaur Secretary'

#17.List the names of customers who have rented the film titled silence kane
select c.first_name,c.last_name from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where f.title = 'Silence Kane'

#18.Get the film titles and rental dates for all rentals made on August 10,2005.
select f.title,r.rental_date from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id where date(rental_date) = '2005-08-10'

#19.Retrieve the film titles rented by the customer with customer_id 500.
select f.title from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.customer_id = 500

#20.Display the rental date and rental duration for each rental made by customer Karen Smith.
select rental_date,f.rental_duration from film f
join inventory i on i.film_id = f.film_id 
join rental r on r.inventory_id = i.inventory_id
join  customer c on c.customer_id = r.customer_id where c.first_name = 'Karen' and c.last_name = 'Smith'

#21.List the film titles and rental dates for all rentals made by customer Steven Taylor;.
select f.title,r.rental_date from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.first_name = 'Steven' and c.last_name ='Taylor'

#22.Display the names of customers who have rented the film titled Ocean Luke
select c.first_name,c.last_name from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id where f.title = 'Ocean Luke'

#23.Get the first name, last name, and email of customers who have rented more than 10 films.
select c.first_name, c.last_name, c.email from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id having count(c.customer_id) > 10

#24.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 600.
select f.title,r.rental_date from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join customer c on c.customer_id = r.customer_id where c.customer_id = 600

#25.List the rental date and return date for all rentals made by customer Susan Johnson;.
select r.rental_date,r.return_date from rental r 
join customer c on c.customer_id = r.customer_id where c.first_name = 'Susan' and c.last_name = 'Johnson'

#26. Display the film titles rented by the customer with customer_id 599.
select f.title, c.customer_id from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=599;

#27. Get the names of customers who have rented the film titled Murder Antitrust
select c.first_name, c.last_name  from customer c 
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id where f.title='Murder Antitrust';

#28. Retrieve the rental date and rental duration for each rental made by customer Joseph Joy
select r.rental_date, f.rental_duration from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Joseph" and c.last_name="Joy";

#29. List the film titles and rental dates for all rentals made by customer Michael Silverman
select f.title, r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Michael" and c.last_name="Silverman";

#30. Display the first name, last name, and email of customers who have rented the film titled Squad Fish
select c.first_name, c.last_name, c.email from customer c 
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id where f.title='Squad Fish';

#31. Get the film titles and rental dates for all rentals made on July 25, 2005.
select f.title,r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-07-25';

#32. Retrieve the film titles rented by the customer with customer_id 400.
select f.title, c.customer_id from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=400;

#33. List the rental date and return date for all rentals made by customer Barbara Jones
select f.title, r.rental_date,r.return_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Barbara" and c.last_name="Jones";

#34. Display the names of customers who have rented the film titled Zorro Ark.
select c.first_name, c.last_name from customer c 
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id where f.title='Zorro Ark';

#35. Get the first name, last name, and email of customers who have rented more than 8 films.
select c.first_name,c.last_name, c.email from customer c 
join rental r on r.customer_id=c.customer_id 
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id 
group by c.first_name,c.last_name, c.email having count(distinct(f.film_id))>8;

#36. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 366.
select f.title, r.rental_date, c.customer_id from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=366;

#37. List the rental date and rental duration for each rental made by customer Helen Harris
select r.rental_date,f.rental_duration from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Helen" and c.last_name="Harris";

#38. Display the film titles rented by the customer with customer_id 428.
select f.title from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=428;

#39. Get the names of customers who have rented the film titled Carol Texas
select c.customer_id, c.first_name, c.last_name from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Carol Texas';

#40. Retrieve the rental date and return date for each rental made by customer Lisa Anderson.
select r.rental_date,r.return_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Lisa" and c.last_name="Anderson";

#41. List the film titles and rental dates for all rentals made by customer Matthew Smith
select f.title, r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Matthew" and c.last_name="Mahan";

#42. Display the first name, last name, and email of customers who have rented the film titled Innocent Usual
select c.customer_id, c.first_name, c.last_name, c.email from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Innocent Usual';

#43. Get the film titles and rental dates for all rentals made on June 18, 2005.
select f.title,r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-06-18';

#44. Retrieve the film titles rented by the customer with customer_id 100.
select f.title from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=100;

#45. List the rental date and return date for all rentals made by customer Jennifer Lee
select f.title, r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Jennifer" and c.last_name="Lee";

#46. Display the names of customers who have rented the film titled Inferno Kilometer
select c.customer_id, c.first_name, c.last_name from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Indian Love';

#47. Get the first name, last name, and email of customers who have rented more than 12 films.
select c.first_name,c.last_name,c.email from customer c 
join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>12;

#48. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 120.
select f.title, r.rental_date from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=120;

#49. List the rental date and rental duration for each rental made by customer David Royal
select f.title, r.rental_date, f.rental_duration from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="David" and c.last_name="Royal";

#50. Display the film titles rented by the customer with customer_id 130.
select f.title from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=130;


