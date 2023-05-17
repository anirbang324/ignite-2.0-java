1. Write a query to display the details of the building whose owner_name is 'Nicholas'.

select * from building where owner_name='Nicholas';


2. Write a query to display the details of all the bills whose 'total_units' greater than 10000, sorted by total_units in descending order.

select * from bill where total_units > 10000 order by  total_units desc;


3. select * from bill where total_units > 10000 order by  total_units desc;

select * from bill where due_date = '2017-10-01' order by payable_amount desc;


4. select * from bill where due_date = '2017-10-01' order by payable_amount desc;

select * from bill where payment_date like '2018%' order by payable_amount desc;


5. Write a query to display the owner_name, address and contact_number of the buildings which does not have an email_address, sorted by owner_name in ascending order.

select owner_name, address, contact_number from building where email_address is null order by owner_name asc;


6. Write a query to display the entire details of the building whose owner_name starts with the letter 'M', sorted by owner_name in ascending order.

select * from building where owner_name like 'M%' order by owner_name asc;


7. Write a query to display the entire details of the building whose building_type_id is 2, sorted by owner_name in ascending order.

select * from building where building_type_id = 2 order by owner_name asc;


8. Write a query to display the details of the electricity_reading whose total_units per day is between 500 and 1000, sorted by total_units in ascending order.

select * from electricity_reading where total_units between 500 and 1000 order by total_units asc;


9. Write a query to display the details of the bill whose payment is not completed, sorted by due_date in ascending order.

select * from bill where is_payed=0 order by due_date asc;


10. Write a query to display the meter_id and total_units of electricity_reading whose 13th hour reading is lesser than the 14th hour reading, sorted by total_units in descending order.

select meter_id, total_units from electricity_reading where h13<h14 order by total_units desc;


11. Write a query to display the details of the meter whose meter_number starts with 'S' and ends with '6'.

select * from meter where meter_number like 'S%' and meter_number like '%6';


12. Write a query to display the name of all building types that ends with letter 'L'.Display the record in ascending order based on building type name.

select name from building_type where name like '%L' order by name asc;


13. Write a query to display all the details of the buildings whose owner name contains 'di' in it. Display the records sorted in ascending order based on the owner name of the building.

select * from building where owner_name like '%di%' order by owner_name asc;


14. Write a query to display all the details of bills whose payment date is on 2nd of the month and also display the record in  descending order based on the total units.

select * from bill where payment_date like '%-%-02' order by total_units desc;


15. Write a query to display the due date and  payable amount  of all the payment dates that are all not fall in between '2017-09-10' to '2017-10-10'.

select due_date, payable_amount from bill where payment_date not between '2017-09-10' and '2017-10-10';


16. Write a query to display the due_date ,payment_date,difference betweeen the due date and the payment date of the bill in days and amount paid, whose payment  date is not exceeding the  due date.Give an alias name for difference betweeen the due date and the payment date as 'date_difference'.

