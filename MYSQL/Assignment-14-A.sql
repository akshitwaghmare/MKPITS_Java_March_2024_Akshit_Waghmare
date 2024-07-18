#1. **Retrieve Actor Information by Last Name**:
 #  Write a procedure that accepts an actor's last name as input and returns a list of all actors with that last name, 
 #including their first name, last name, and actor ID.

delimiter $$
create procedure informer(in lastname varchar(25),out details char(250))
begin
select first_name,last_name,actor_id from actor where last_name = lastname;
end $$
delimiter ;
call informer('chase',@details)


#2. **List Films by Category**:
#   Create a procedure that takes a category name as input and returns all films in that category,
# including film title, description, release year, and rating.

delimiter $$
create procedure filmy(in categoryname char(200),out f char(230))
begin
select title,description,release_year from film f
join 
end $$
delimiter 
call filmy

#3. **Calculate Total Payment by Customer**:
#   Develop a procedure that accepts a customer ID and returns the total amount paid by that customer. 
#The result should include the customer ID, first name, last name, and total payment amount.

delimiter //
create procedure totPayment(in cID int)
begin
select c.customer_id, c.first_name, c.last_name, sum(p.amount) as tot
from payment p
join customer c on c.customer_id = p.customer_id
where c.customer_id = cID
group by c.customer_id, c.first_name, c.last_name;
end //
delimiter ;

call totPayment('1');

#4. **Count Rentals by Date Range**:
 #  Implement a procedure that accepts a start date and an end date and returns the number of rentals made within that date range. 
 #Include the rental ID and rental date in the results.
 
 delimiter //
create procedure countRental (in sDate date, in eDate date)
begin
select rental_id, rental_date
from rental
where rental_date between date(sDate) and date(eDate);
end //
delimiter ;

call countRental ('2005-05-24','2005-05-29');

#5. **Update Film Rental Rate**:
 #  Write a procedure to update the rental rate of a specific film. 
 #The procedure should accept the film ID and the new rental rate as inputs and then update the rental rate for that film in the database.
 #Return the film ID, old rental rate, and new rental rate as output.
 
