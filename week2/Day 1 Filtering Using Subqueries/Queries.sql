1.Write a query to display all the building details in which building type is ‘Library’ .Display the records in ascending order based on their owner_name.

select * from building where building_type_id in
(select id from building_type where name = 'Library') 
order by owner_name asc;


2. Write a query to display all the contact number of the building type 'Police Station' .Display the records in ascending order based on the contact number.

select contact_number from building where building_type_id in 
(select id from building_type where name ='Police Station') 
order by contact_number asc;


3. Write a query to display the building type name of the meter number 'SG824012'.

select name from building_type where id in
(select building_type_id from building where id in
 (select building_id from meter where meter_number = 'SG824012') ) ;


 4. Write a query to display the meter number of the building type 'College'.Display the records in ascending order based on their meter number.

select meter_number from meter where building_id in 
(select id from building where building_type_id  in
 (select id from building_type where name = 'College')) order by meter_number asc;


 5. Write a query to display the total units and payable amount of the particular meter number 'SG934826'.

 select total_units , payable_amount from bill where id in 
(select building_id from meter where meter_number ='SG934826')


6. Write a query to display the number of  the buildings who has charged for  fine amount.Give an alias name as 'building_count'.

select count(building_type_id) as building_count from building where id in
(select building_id from meter where id in
(select meter_id from bill where fine_amount is not null));


7. Write a query to display the average payable amount of the buildings whose slab rate is less than 24.Give an alias name for payable amount as 'payable_amount'.

select avg(payable_amount) as payable_amount from bill where meter_id in
(select id  from meter where building_id in
 (select id from building where building_type_id in 
 (select id from building_type where connection_type_id in
 (select id from electricity_connection_type where id in
 (select connection_type_id from slab where rate<24)))));


8. Write a query to display the payment date of the particular meter number 'SG288942'.

select payment_date from bill where meter_id in 
(select building_id from meter where meter_number = 'SG288942');


9. Write a query to get the meter numbers of the building whose electricity reading registered on a particular day of '2018/05/07' .Display the records in ascending order based on their meter number.

select meter_number from meter where id in 
 (select meter_id from electricity_reading where day = '2018/05/07')  
 order by meter_number asc;


 10. Write a query to display the owner name of the building who consumed maximum units in a bill. If there are multiple records, then display the records sorted in ascending order based on owner name.

 select owner_name from building where id in
(select building_id from meter where id in
 (select meter_id from bill where total_units in ( select max(total_units) from bill)))
order by owner_name asc;


11. Write a query to display the meter number of the building who consumed minimum amount of units in a bill.Display the records  in ascending order based on meter number.

select meter_number from meter where id in
 (select meter_id from bill where total_units in ( select min(total_units) from bill))
order by meter_number asc;


12. Write a query to display the meter number of the building who consumed maximum amount of units during 8PM for a day.

select meter_number from meter where id in
 (select meter_id from electricity_reading where h20 in ( select max(h20) from electricity_reading));


 13. Write a  query to display the meter number of the building who consumed minimum amount of units during 9PM.Display the records in ascending order based on their meter number.

 select meter_number from meter where id in
 (select meter_id from electricity_reading where h21 in ( select min(h21) from electricity_reading));


 14. Write a query to display the meter number of the building who have given the maximum fine amount of a month.

 select meter_number from meter where id in 
(select meter_id from bill where fine_amount = (select max(fine_amount) from bill)); 


15. Write a query to display the owner name, contact number of the building whose are all billed on 'October' Month.Display the records in ascending order based on their owner name.

SELECT owner_name, contact_number FROM building WHERE id IN
( SELECT building_id  FROM meter  WHERE id IN 
 (  SELECT meter_id  FROM bill  WHERE MONTH = 10)) 
ORDER BY owner_name ASC;


16. Write a query to display the number of bills paid of  connection type 'Commercial' .Give an alias name as 'payment_count'.

select count(is_payed) as payment_count from bill where is_payed=1 and  meter_id in
(select id from meter where building_id  in
 (select id from building where building_type_id in
  (select id from building_type where connection_type_id in
   (select id from electricity_connection_type where connection_name = 'Commercial'))));


17. Write a query to display the address of the buildings whose connection type is 'Home'.Display the records in ascending order based on their address.

select address from building where building_type_id in
(select id from building_type where connection_type_id in
 (select id from electricity_connection_type where connection_name = 'Home'))
 order by address asc;


18. Write a query to display the owner name of the building who consumed minimum units of current for the day.

select owner_name from building where id in 
(select building_id from meter where id in
 (select meter_id from electricity_reading where total_units = 
(select min(total_units) from electricity_reading)));


19. Write a query to display the total and average amount of units consumed by the 'Commercial' type on 8PM.Give an alias name for total as 'total_amount' and average as 'average_amount'.

select sum(h20) as total_amount , avg(h20) as average_amount from electricity_reading where meter_id in
(select id from meter where building_id in
 (select id from building where building_type_id in
  (select id from building_type where connection_type_id in
   (select id from electricity_connection_type where connection_name= 'Commercial'))));  


20. Write a query to display the rate from the slab whose meter number is 'SG567423'.

select rate from slab where connection_type_id in
(select id from electricity_connection_type where id in 
 (select connection_type_id from building_type where id in
  (select building_type_id from building where id in
   (select building_id from  meter where meter_number = 'SG567423'))));