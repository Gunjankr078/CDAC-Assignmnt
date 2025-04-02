delimiter //
-- =================================================================
-- Question 1
drop procedure getempdetails//
create procedure getempdetails(in id int )
   begin
   select * from employees where emp_id = id;
   end//

call getempdetails(4)//

-- =================================================================
-- Question 2

delimiter //
drop procedure insertemp//
create procedure insertemp(in eid int , in fname varchar(50) , in lname varchar(50) ,in email varchar(50) , in hdate date , in sal decimal(10 ,2) , in deptid int )
   begin 
   insert into employees values(eid , fname , lname, email, hdate,sal,deptid);
end//

call insertemp(6,'palash','sahu','palash@gmail.com','2025-01-01',10000.00,2) //

-- =======================================================================
-- Question 3
create procedure deletemp(in exp int)
  begin
  delete from employees
  where datediff(curdate() , hire_date)/365 < exp;
  end //


 call deletemp(3)//
-- ====================================================================

-- Question 4
create procedure countalldeptemp()
  begin 
  select dept_id, count(*) as employee_count
    from employees
    group by dept_id
    order by dept_id;
  end//

call countalldeptemp()//

-- ====================================================================
-- Problem Statements on MySQL Stored Procedures (Using IN and OUT Parameters)
-- Question 1

create procedure countempout(in id int , out count int)
  begin 
  select count(*) as empcount into count from employees where dept_id = id;
  end//

call countempout(2 , @count)//

select @count//


-- ====================================================================
-- Question 2

create procedure countsal(in id int , out totalsal int)
  begin 
  select sum(salary) into totalsal from employees where dept_id = id;

  
  end//

call countsal(1 , @totalsal)//

select @totalsal //


-- ====================================================================
-- Question 3

create procedure maxsalary(in id int , out maxsal int)
  begin 
  select max(salary) into maxsal from employees where dept_id = id;

  
  end//

call maxsalary(1 , @maxsalary)//

select @maxsalary //
 
-- ====================================================================
-- Question 4
drop procedure updatesal//
create procedure updatesal(in id int ,in per int)
  begin 
  update employees
  set salary = salary+(salary*per/100)
  where dept_id = id;

  end//

call updatesal(1 , 10)//

-- ====================================================================
-- Question 5

create procedure getempinfo(in id int ,out fname varchar(50) , out lname varchar(50), out deptid int )
  begin 
  select first_name ,last_name,dept_id into fname,lname,deptid 
  from employees where emp_id = id;
  end//

call getempinfo(1 , @fname,@lname,@deptid)//

select  @fname,@lname,@deptid //

-- ====================================================================




