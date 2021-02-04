create database EPskill;
use EPskill;
CREATE TABLE employee(name varchar(20),emp_id int primary key,age int,dept varchar(20),dateofbirth date ,salary int,
designation varchar(20));
desc employee;
insert into employee value ('A',101,29,'cyber security','1990-10-20',30000,'Manager');
insert into employee value ('B',102,30,'IT','1989-01-10',24000,'Line Manager');
insert into employee value ('C',103,26,'HR','1995-08-2',32000,'Team Leader');
insert into employee value ('D',104,22,'cyber security','1999-06-25',28000,'People Manager');
insert into employee value ('E',105,33,'cyber security','1987-12-14',29000,'Transition Manager');
insert into employee value ('F',106,30,'cyber security','1989-02-14',32000,'Senior Manager');
select * from employee;
DELETE FROM employee WHERE emp_id=106;
UPDATE employee SET dept='PAM dept',designation='Senior Manager' WHERE emp_id=105;
select * from employee;
