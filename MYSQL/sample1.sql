use sakila
show tables
#To view description of table.
desc actor_info
#To view all info from table
select * from actor_info
#To veiw specific fields from table
select first_name as "Name",film_info from actor_info
select distinct film_id from film actor
select * from film where release_year=2006
select * from actor_info where first_name = 'nick'

select * from actor_info
where first_name IN('NICK','PENELOPE','BETTE') 
select * from actor_info order by first_name,last_name

