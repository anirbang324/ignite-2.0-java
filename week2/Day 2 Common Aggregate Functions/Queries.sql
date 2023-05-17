1. Write a query to display the batch of the seniormost alumni woking as 'Project Manager'. Give an alias as Senior_PM_Batch.

SELECT min(batch) AS Senior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;


2. Write a query to display the batch of the juniormost alumni woking as 'Project Manager'. Give an alias as Junior_PM_Batch.

SELECT max(batch) AS Junior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;


3. Write a query to display the average unit of electricity consumption for all the meter in electricity readings.Give an alias name to the average units as 'average_units_of_electricity'.

select avg(total_units) as average_units_of_electricity from electricity_reading ;


4. Write a query to display the average payable amount from bill where payable_amount is greater than 10000.Give an alias name to the average payable amount as 'average_payable_amount'.

select avg(payable_amount) as average_payable_amount from bill
where payable_amount >10000;


5. Write a query to display the sum of payable amount from bill.Give an alias name to the sum of payable amount as 'sum_payable_amount'.

select sum(payable_amount) as sum_payable_amount from bill ;


6. Write a query to display the sum of payable amount with due date '2017-10-01'.Give an alias name to the sum of payable amount as 'sum_payable_amount'.

select sum(payable_amount) as sum_payable_amount from bill
where due_date = '2017-10-01';


7. Write a query to display the minimum total units consumed by all users from electricity reading table. Give an alias name to the minimum total units as 'min_total_units'.

select min(total_units) as min_total_units from electricity_reading ;


8. Write a query to display the average 8th hour unit consumption from electricity reading for all users.Give an alias name to the average 8th hour consumption as 'average_8th_hour_consumption'.

select avg(h8) as average_8th_hour_consumption from electricity_reading;


9. Write a query to display the sum of payable amount and fine amount from bills having the fine amount.Give an alias name to the sum of payable amount and fine amount as 'sum_payable_and_fine_amount'.

select sum(payable_amount+fine_amount) as sum_payable_and_fine_amount from bill;


10. Write a query to display the sum of 12th hour unit consumption from electricity reading for all users.Give an alias name to the sum of 12th hour consumption as 'sum_12th_hour_consumption'.

select sum(h12) as sum_12th_hour_consumption from electricity_reading ;


11. Write a query to display the total payable amount, whose payment date is on the year 2018.Give an alias name to the total payable amount as 'sum_payable_amount'.

select sum(payable_amount) as sum_payable_amount from bill 
where year(payment_date) ='2018';