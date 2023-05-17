1. Write a query to display all the bills with meter details. Display the records in ascending order based on payable amount.

select b.* , m.* from bill b
inner join meter m on   b.meter_id= m.id 
order by payable_amount asc;


2. Write a query to display the meter number,owner name,address and contact number of all the buildings. Display the records in ascending order based on owner name then by meter_number.

select m.meter_number , b.owner_name , b.address , b.contact_number from building b 
inner join meter m on b.id = m.building_id  order by b.owner_name , m.meter_number;


3. Write a query to display the connection name ,from_unit,to_unit and rate of all the slabs.Display the records in ascending order based on rate.

select ect.connection_name , s.from_unit , s.to_unit , s.rate from electricity_connection_type ect 
inner join slab s on ect.id=s.connection_type_id order by rate asc;


4. Write a query to display owner name,address ,meter number and total units consumed by all the customers in the month december 2017.Display the records in descending order by total_units.

select b.owner_name, b.address , m.meter_number ,  bi.total_units from building b 
inner join meter m on b.id= m.building_id
inner join bill bi on m.id= bi.meter_id 
where bi.month = 12 and bi.year = 2017 order by total_units desc;


5. Write a query to display the connection type name and number of connections under each connection name and give alias name as connection_count.Display the records in descending order based on connection_count.

Hint:
Join electricity_connection_type, building_type, building and meter table.\

SELECT e.connection_name, COUNT(*) AS connection_count 
FROM electricity_connection_type e
inner join building_type bt on e.id=bt.connection_type_id
inner join building b on bt.id=b.building_type_id
inner join meter m on b.id=m.building_id
GROUP BY e.connection_name 
ORDER BY connection_count DESC;


6. Write a query to display all the route details with travel payment details.Display the records in ascending order based on route_name

