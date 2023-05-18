1. Write a query to display the  meter number,owner name,address,contact number,building type name and connection name of all buildings.Display the record in ascending order based on owner name then by meter_number..

select ani.meter_number , fiz.owner_name , fiz.address , fiz.contact_number , bt.name , ect.connection_name
from electricity_connection_type ect
join building_type bt on ect.id=bt.connection_type_id
join building fiz on bt.id=fiz.building_type_id
join meter ani on fiz.id=ani.building_id
order by fiz.owner_name , ani.meter_number;


2. Write a query to display the building owner name ,address and number of connections present in each building. Display the records in ascending order based on owner name.Give an alias name as connection_count.

SELECT b.owner_name, b.address, COUNT(m.id) AS connection_count
from building_type bt 
 join building b  ON bt.id = b.building_type_id
 JOIN meter m ON b.id = m.building_id
GROUP BY b.owner_name, b.address
ORDER BY b.owner_name ASC;


3. Write a query to display owner name,address ,meter number and payable amount of all the bill which are all not having fine amount that are generated for 2017 December.  Display the records in ascending order based on owner name.

select an.owner_name , an.address , m.meter_number , b.payable_amount 
from building an
join meter m on an.id= m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount is null and (b.month=12 and b.year= 2017)
order by an.owner_name asc;


4. Write a query to display owner name, address , meter number and payable amount of all the bills with the maximum fine amount. If there are multiple records display in ascending  order based on owner_name.

select bm1.owner_name , bm1.address , m.meter_number , b.payable_amount 
from building bm1
join meter m on bm1.id= m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount in(select max(bl.fine_amount) from bill bl)
order by bm1.owner_name asc;


5. Write a query to display the owner_name and total amount who paid the maximum bill amount in the year 2017.If there are multiple records display the record in ascending order based on owner_name Give an alias name as "TotalBillAmount".

select bg.owner_name, sum(b.payable_amount) as TotalBillAMount 
from building bg
join meter m on m.building_id=bg.id
join bill b on b.meter_id=m.id 
where m.id=(select b1.meter_id from bill b1 where b1.payable_amount in 
 (select max(b2.payable_amount) from bill b2 where b2.fine_amount is null and b2. year=2017)) 
order by bg.owner_name;


6. Write a query to display the owner name,building type name,meter number and payment date of the bill which are raised in the month December 2017. If the payment is not done, then display it as 'Not Paid Yet'. Give an alias name for payment date as 'Payment_Status'. Display the record in ascending order based on owner name.


select b.owner_name, bt.name, m.meter_number, if(bi.is_payed=0, 'Not Paid Yet', bi.payment_date) as Payment_Status
from building_type bt
join building b on bt.id=b.building_type_id
join  meter m on b.id=m.building_id
join  bill bi on m.id=bi.meter_id
where bi.month=12 and bi.year=2017
order by b.owner_name asc;