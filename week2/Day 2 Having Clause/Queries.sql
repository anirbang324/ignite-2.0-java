1. Write a query to display the name of the company and the number of alumni who are currently working in each company. Give an alias to the number of alumni as alumni_count.

select company_name , count(current) as alumni_count
from experience where current =1 group by company_name;


2. Write a query to display the year and the number of events scheduled in each year, sorted by year. Give an alias as number_of_events.

select year(date) , count(*) as number_of_events 
from event  group by year(date);


3. Write a query to display the name of the month and the number of events scheduled in each month in the year 2013, sorted by month. Give an alias as number_of_events. Name of the month must be displayed as January, February ...

select monthname(date) , count(*) as number_of_events 
from event where year(date) = 2013 
group by monthname(date) order by month(date);