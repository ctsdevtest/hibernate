create table UserDetails
(
userId number(3),
userName VARCHAR2(255)
)

CREATE SCHEMA TESTSCHEMA;

CREATE SCHEMA RAHUL;
select * from HR.USERDETAILS

--select * from employee
select * from emp


   CREATE TABLE Employee  
    (  
    EmployeeID number(10),  
    FirstName varchar2(255),  
    LastName varchar2(255),  
    Email varchar2(255),  
    AddressLine varchar2(255),  
    City varchar2(255)  
    );
    
CREATE TABLE managerTest  
    (  
    empname varchar2(20),
    empno number (5),  
    manager number (5)  
    );    
    
    
    insert into MANAGERTEST values ('Rahul',2500,2600);
    insert into MANAGERTEST values ('Vishwanath',2600,2700);
    insert into MANAGERTEST values ('Anamika',2700,2800);
    insert into MANAGERTEST values ('Milind',2800,2900);
    insert into MANAGERTEST values ('Homi',2900,3000);
    insert into MANAGERTEST values ('Lopesh',3000,1000);
    insert into MANAGERTEST values ('Ramesh',1000,null);
    
    select * from MANAGERTEST
    select count(*),empname,empno,manager from MANAGERTEST group by empname,empno,manager having count(*)>1
    select empno,empname,manager from MANAGERTEST CONNECT by PRIOR empno=manager	
    select  a.empno empnumber, a.empname manager, b.empname emp from MANAGERTEST a, MANAGERTEST b where a.empno =b.manager
    
    
    alter table employee add salary number(8) 
    
    select * from employee order by salary
    
    select max(salary) from employee where salary not in (select max(salary) from employee)
    
    
     select FirstName,SUM(salary) from employee group by FirstName having salary = MAX(salary)
     select * from employee