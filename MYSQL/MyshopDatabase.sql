create database MyShop
use Myshop
create table Inventory
(
 product_id INT ,
 product_name VARCHAR(100),
 category VARCHAR(50),
 brand VARCHAR(50),
 stock INT,
 product_price INT,
 date_of_expiry DATE
)
create table Supplier
(
supplier_id INT,
supplier_name VARCHAR(100),
contact_num VARCHAR(15),
email VARCHAR(50),
address VARCHAR(50)
)
create table Customer 
(
customer_id INT,
customer_name VARCHAR(100),
contact_num VARCHAR(15),
customer_email VARCHAR(100),
address VARCHAR(255),
date_of_birth DATE
)
create table Staff 
(
staff_id INT,
staff_name VARCHAR(100),
contact_num VARCHAR(15),
email VARCHAR(100),
address VARCHAR(255),
designation VARCHAR(50)
)
create table Sales 
(
sale_id INT,
product_id INT,
customer_id INT,
staff_id INT,
sale_date DATE,
quantity INT,
payment_method VARCHAR(50),
totalcollection INT
)

INSERT INTO Inventory VALUES
(1, 'Laptop', 'Electronics', 'Dell', 50, 800, '2025-12-31'),
(2, 'Smartphone', 'Electronics', 'Samsung', 100, 600, '2024-12-31'),
(3, 'Headphones', 'Electronics', 'Sony', 150, 150, '2023-12-31'),
(4, 'Television', 'Electronics', 'LG', 30, 1200, '2026-12-31'),
(5, 'Refrigerator', 'Appliances', 'Whirlpool', 20, 700, '2027-12-31'),
(6, 'Microwave', 'Appliances', 'Panasonic', 40, 300, '2025-12-31'),
(7, 'Washing Machine', 'Appliances', 'Bosch', 25, 500, '2028-12-31'),
(8, 'Oven', 'Appliances', 'Samsung', 35, 400, '2025-12-31'),
(9, 'Tablet', 'Electronics', 'Apple', 60, 1000, '2024-12-31'),
(10, 'Camera', 'Electronics', 'Canon', 45, 550, '2025-12-31');
INSERT INTO Supplier VALUES
(1, 'Supplier A', '1234567890', 'supplierA@example.com', 'Address 1'),
(2, 'Supplier B', '0987654321', 'supplierB@example.com', 'Address 2'),
(3, 'Supplier C', '1234509876', 'supplierC@example.com', 'Address 3'),
(4, 'Supplier D', '9876512340', 'supplierD@example.com', 'Address 4'),
(5, 'Supplier E', '5678901234', 'supplierE@example.com', 'Address 5'),
(6, 'Supplier F', '0987612345', 'supplierF@example.com', 'Address 6'),
(7, 'Supplier G', '1234987650', 'supplierG@example.com', 'Address 7'),
(8, 'Supplier H', '9876098123', 'supplierH@example.com', 'Address 8'),
(9, 'Supplier I', '5678904321', 'supplierI@example.com', 'Address 9'),
(10, 'Supplier J', '0987650432', 'supplierJ@example.com', 'Address 10');
INSERT INTO Customer VALUES
(1, 'Customer A', '1122334455', 'customerA@example.com', 'Address A', '1990-01-01'),
(2, 'Customer B', '2233445566', 'customerB@example.com', 'Address B', '1985-02-02'),
(3, 'Customer C', '3344556677', 'customerC@example.com', 'Address C', '1995-03-03'),
(4, 'Customer D', '4455667788', 'customerD@example.com', 'Address D', '1980-04-04'),
(5, 'Customer E', '5566778899', 'customerE@example.com', 'Address E', '1975-05-05'),
(6, 'Customer F', '6677889900', 'customerF@example.com', 'Address F', '2000-06-06'),
(7, 'Customer G', '7788990011', 'customerG@example.com', 'Address G', '1992-07-07'),
(8, 'Customer H', '8899001122', 'customerH@example.com', 'Address H', '1988-08-08'),
(9, 'Customer I', '9900112233', 'customerI@example.com', 'Address I', '1998-09-09'),
(10, 'Customer J', '0011223344', 'customerJ@example.com', 'Address J', '1982-10-10');
INSERT INTO Staff VALUES
(1, 'Staff A', '1111222233', 'staffA@example.com', 'Address A', 'Manager'),
(2, 'Staff B', '2222333344', 'staffB@example.com', 'Address B', 'Cashier'),
(3, 'Staff C', '3333444455', 'staffC@example.com', 'Address C', 'Sales Assistant'),
(4, 'Staff D', '4444555566', 'staffD@example.com', 'Address D', 'Manager'),
(5, 'Staff E', '5555666677', 'staffE@example.com', 'Address E', 'Cashier'),
(6, 'Staff F', '6666777788', 'staffF@example.com', 'Address F', 'Sales Assistant'),
(7, 'Staff G', '7777888899', 'staffG@example.com', 'Address G', 'Manager'),
(8, 'Staff H', '8888999900', 'staffH@example.com', 'Address H', 'Cashier'),
(9, 'Staff I', '9999000011', 'staffI@example.com', 'Address I', 'Sales Assistant'),
(10, 'Staff J', '0000111122', 'staffJ@example.com', 'Address J', 'Manager');
INSERT INTO Sales VALUES
(1, 1, 1, 1, '2023-01-01', 2, 'Credit Card', 1600),
(2, 2, 2, 2, '2023-01-02', 1, 'Cash', 600),
(3, 3, 3, 3, '2023-01-03', 4, 'Debit Card', 600),
(4, 4, 4, 4, '2023-01-04', 1, 'Credit Card', 1200),
(5, 5, 5, 5, '2023-01-05', 1, 'Cash', 700),
(6, 6, 6, 6, '2023-01-06', 1, 'Debit Card', 300),
(7, 7, 7, 7, '2023-01-07', 1, 'Credit Card', 500),
(8, 8, 8, 8, '2023-01-08', 1, 'Cash', 400),
(9, 9, 9, 9, '2023-01-09', 1, 'Debit Card', 1000),
(10, 10, 10, 10, '2023-01-10', 1, 'Credit Card', 550);
