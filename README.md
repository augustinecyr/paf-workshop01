## Persistence and Analytics Fundamentals

### Introduction to MySQL

## Commands
### MySQL Workbench
1. show databases;
2. CREATE DATABASE northwind;
3. CREATE USER 'fred'@'localhost' IDENTIFIED BY 'Password@123456';
4. GRANT ALL PRIVILEGES ON *.* TO 'fred'@'localhost' WITH GRANT OPTION;
5. FLUSH PRIVILEGES;

### Commit the sql file
1. cd mywind
2. source northwind.sql
3. commit;
4. source northwind-data.sql
5. commit;

### Display the data
1. show tables;
2. select count(*) from customers;
3. select * from customers;
4. desc customers;

