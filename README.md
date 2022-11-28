## Persistence and Analytics Fundamentals

### Introduction to MySQL

## Commands
### MySQL Workbench
show databases;
CREATE DATABASE northwind;
CREATE USER 'fred'@'localhost' IDENTIFIED BY 'Password@123456';
GRANT ALL PRIVILEGES ON *.* TO 'fred'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

### Commit the sql file
cd mywind
source northwind.sql
commit;
source northwind-data.sql
commit;

### Display the data
show tables;
select count(*) from customers;
select * from customers;
desc customers;

