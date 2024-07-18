use 
select * from accountdetails
select * from customerdetails
select * from staffdetails
select * from transactiondetails

create database Shop
CREATE TABLE Customer (
    Customer_Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Address VARCHAR(100),
    City VARCHAR(50)
);use shop


CREATE TABLE Supplier (
    Supplier_Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Address VARCHAR(100),
    City VARCHAR(50)
);

CREATE TABLE ProductMaster (
    Product_Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Price DECIMAL(10, 2),
    QOH INT
);

CREATE TABLE Sale (
    Sale_Id INT PRIMARY KEY,
    Product_Id INT,
    Customer_Id INT,
    Quantity INT,
    Date DATE,
    FOREIGN KEY (Product_Id) REFERENCES ProductMaster(Product_Id),
    FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id)
);

CREATE TABLE Purchase (
    Purchase_Id INT PRIMARY KEY,
    Product_Id INT,
    Supplier_Id INT,
    Quantity INT,
    Date DATE,
    FOREIGN KEY (Product_Id) REFERENCES ProductMaster(Product_Id),
    FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id)
);

INSERT INTO Customer (Customer_Id, Name, Address, City) VALUES
(1, 'John Doe', '123 Elm St', 'New York'),
(2, 'Jane Smith', '456 Oak St', 'Los Angeles'),
(3, 'Bob Johnson', '789 Pine St', 'Chicago'),
(4, 'Alice Williams', '101 Maple St', 'Houston'),
(5, 'Michael Brown', '202 Birch St', 'Phoenix'),
(6, 'Mary Jones', '303 Cedar St', 'Philadelphia'),
(7, 'David Miller', '404 Spruce St', 'San Antonio'),
(8, 'Sarah Wilson', '505 Willow St', 'San Diego');

-- Inserting data into Supplier table
INSERT INTO Supplier (Supplier_Id, Name, Address, City) VALUES
(1, 'Acme Corp', '123 Industrial Rd', 'New York'),
(2, 'Global Supplies', '456 Commerce St', 'Los Angeles'),
(3, 'Quality Goods', '789 Trade Ave', 'Chicago'),
(4, 'Best Products', '101 Market Blvd', 'Houston'),
(5, 'Superior Imports', '202 Distribution Ln', 'Phoenix'),
(6, 'Reliable Sources', '303 Supply St', 'Philadelphia'),
(7, 'Wholesale Hub', '404 Vendor Rd', 'San Antonio'),
(8, 'Prime Distributors', '505 Merchandise Way', 'San Diego');

-- Inserting data into ProductMaster table
INSERT INTO ProductMaster (Product_Id, Name, Price, QOH) VALUES
(1, 'Product A', 10.99, 100),
(2, 'Product B', 19.99, 150),
(3, 'Product C', 7.99, 200),
(4, 'Product D', 14.99, 250),
(5, 'Product E', 25.99, 300),
(6, 'Product F', 9.99, 50),
(7, 'Product G', 29.99, 75),
(8, 'Product H', 4.99, 125);

-- Inserting data into Sale table
INSERT INTO Sale (Sale_Id, Product_Id, Customer_Id, Quantity, Date) VALUES
(1, 1, 1, 2, '2024-01-15'),
(2, 2, 2, 1, '2024-01-20'),
(3, 3, 3, 4, '2024-01-25'),
(4, 4, 4, 3, '2024-02-01'),
(5, 5, 5, 5, '2024-02-10'),
(6, 6, 6, 6, '2024-02-15'),
(7, 7, 7, 2, '2024-02-20'),
(8, 8, 8, 1, '2024-02-25');

-- Inserting data into Purchase table
INSERT INTO Purchase (Purchase_Id, Product_Id, Supplier_Id, Quantity, Date) VALUES
(9, 1, 9, 20,'2024-08-10'),
(2, 2, 2, 150, '2024-01-15'),
(3, 3, 3, 200, '2024-01-20'),
(4, 4, 4, 250, '2024-01-25'),
(5, 5, 5, 300, '2024-02-01'),
(6, 6, 6, 50, '2024-02-05'),
(7, 7, 7, 75, '2024-02-10'),
(8, 8, 8, 125, '2024-02-15');


 
### Problem 1 *Problem Statement**: Retrieve the names and addresses of all suppliers in 'Los Angeles'.
select name,address from supplier  where city = 'los angeles'

#2 **Problem Statement**: Find the total quantity of products sold.
select sum(quantity) as 'Total Quantity Sold' from sale

#3.List all purchases of product ID 'P001' sorted by date in ascending order.
select p.name as 'Total purchased Items' from productmaster p
join purchase pr on pr.product_id = p.product_id where p.product_id = 4 order by date

#4. Problem Statement**: Find the names of products that have been sold more than 100 times.
select p.name as 'Product name' from productmaster p 
join sale s on s.product_id = p.product_id having count(s.quantity) > 5

#5.**Problem Statement**: Retrieve the product ID and name of the product with the highest price.
select product_id,name from productmaster where price=(select max(price) from productmaster);

#6. Problem Statement**: Find the average price of products in the product master.
select avg(price) from productmaster

select * from sale
#7**Problem Statement**: List the product IDs that have not been sold.
select product_id from sale where h

#8.**Problem Statement**: Retrieve the total number of sales made in the month of June 2024.
select count(sale_id) from sale between '2024-01-01' and '2024-01-31'

