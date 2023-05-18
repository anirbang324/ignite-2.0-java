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

SELECT r.*, tp.*
FROM route r
INNER JOIN station_route sr ON r.id = sr.route_id 
INNER JOIN station s ON sr.station_id = s.id 
INNER JOIN travel_payment tp ON s.id = tp.entry_station_id 
ORDER BY r.route_name ASC;


7. Write a query to display the route name whose station name is 'Woodlands MRT station'. Display the records sorted in ascending order based on route name.

SELECT r.route_name
FROM route r
inner JOIN station_route sr ON r.id = sr.route_id
JOIN station s ON sr.station_id = s.id
WHERE s.name = 'Woodlands MRT station'
ORDER BY r.route_name ASC;


8. Write a query to display the person_name,contact_number,balance,
entry_timeand exit_time of persons who all  entered from the station 'Sengkang MRT station'. Display the records in ascending order based on person_name.

SELECT tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
INNER JOIN station s ON tp.entry_station_id = s.id
WHERE s.name = 'Sengkang MRT station'
ORDER BY tc.person_name ASC;


9. Write a query to display the details of all the travel cards with the payment greater than 25 whose exit time is on the date '2017-12-21'.Display the records in ascending order based on person name.

SELECT tc.* , tp.*
FROM travel_card tc
INNER JOIN travel_payment tp ON  tp.travel_card_id=tc.id
WHERE date(tp.exit_time) = '2017-12-21' and tp.amount>25
ORDER BY tc.person_name ASC;


10. Write a query to display person name,contact number and balance of all the details, who have minimum amount in their travel_card. If there is multiple record dipsplay the record in descending order by person name.

select tc.person_name , tc.contact_number ,tc.balance 
from travel_card tc
inner join travel_payment tp on tc.id=tp.travel_card_id
where tp.amount in (select min(tpt.amount) from travel_payment tpt) 
order by tc.person_name desc;


11. Write a query to display position,updated_time,forward,scheduled time and actual time details,which are belongs to the route 'North South line' or 'Circle line'.Display the records in ascending order based on position and then in descending order based on updated_time.

SELECT distinct  mt.position , mt.updated_time , mt.forward , ts.scheduled_time , tat.actual_time
FROM train_arrival_time tat 
inner join train_schedule ts on tat.train_schedule_id=ts.id
inner join metro_train mt on ts.metro_train_id = mt.id
inner join route r on mt.route_id =r.id
where r.route_name= 'North South line' or r.route_name= 'Circle line'
order by mt.position asc;


12. Write a query to display the names and contact number of person whose destination station is on the route 'North East line' with the payment more than 25.Display the records in ascending order based on person name.

SELECT tc.person_name , tc.contact_number
FROM travel_card tc
INNER JOIN travel_payment tp ON  tc.id=tp.travel_card_id
inner join station s on tp.exit_station_id = s.id
inner join station_route sr on s.id= sr.station_id
inner join route r on sr.route_id=r.id
WHERE r.route_name= 'North East line'  and tp.amount>25
ORDER BY tc.person_name asc;

13. Write a query to display the name and locality of the stations with the metro trains scheduled to arrive on '2017-12-21' along the route 'Circle line'.Display the records in ascending order based on the station name.

SELECT distinct  s.name, s.locality
FROM metro_train mt 
INNER JOIN route r ON mt.route_id = r.id
INNER JOIN station_route sr ON r.id = sr.route_id
INNER JOIN station s ON sr.station_id = s.id
INNER JOIN train_schedule ts ON s.id = ts.station_id
WHERE date(ts.scheduled_time)= '2017-12-21' and r.route_name= 'Circle line' 
ORDER BY s.name asc;

14. Write a query to display the person name,contact number,balance,entry_time and exit_time of all the details, who is having the second highest balance in their travel cards.Display the records in ascending order based on their person_name.

SELECT tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
WHERE tc.balance = (
  SELECT MAX(balance)
  FROM travel_card
  WHERE balance < (
    SELECT MAX(balance)
    FROM travel_card
  )
)
ORDER BY tc.person_name ASC;


15. Write a query to display person name,contact number and balance  of all the details, who travelled for maximum number of times. If there are multiple records then display the records in descending order by person name.

SELECT tc.person_name, tc.contact_number, tc.balance
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
GROUP BY tc.person_name, tc.contact_number, tc.balance
HAVING COUNT(*) = ( SELECT MAX(travel_count)
FROM (  SELECT COUNT(*) AS travel_count FROM travel_payment group by travel_card_id)as travel_max_count) 
ORDER BY tc.person_name DESC;