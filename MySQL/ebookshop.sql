create database ebookshop;
 
use ebookshop;

create table books(
	id int,
	title varchar(50),
	author varchar(50),
	price float,
	qty int,
	primary key(id));
    
insert into books values(1001, 'Java for dummies', 'Tan Ah Teck', 549.87, 48);
insert into books values(1002, 'More Java for dummies', 'Tan Ah Teck', 349.53, 19);
insert into books values(1003, 'More Java for more dummies', 'Ramesh', 287.39, 25);
insert into books values(1004, 'python for dummies', 'Han Ah Teck', 784.65, 32);
insert into books values(1005, 'More Python for dummies', 'suresh', 625.57, 54);
insert into books values(1006, 'More Python for More dummies', 'Tan Ah jack', 928.42, 23);