1. Write a query to display the details of the buildings whose owner name is 'Muzzammil' and 'Nicholas' in ascending order based on the owner name and then by email address.
Note: Use union

select * from building where owner_name =  'Muzzammil'
union
select * from building where owner_name = 'Nicholas'
order by owner_name , email_address asc;


2. Write a query to display the number of bills paid with respect to payment date in the month of october and number of bills with payment date in the month of december.Give an alias name to the number of bills as no_of_bills.Display the record in descending order based on no_of_bills .
Note: Use union

SELECT COUNT(*) as no_of_bills
FROM bill
WHERE MONTH(payment_date) = 10
UNION
SELECT COUNT(*) as no_of_bills
FROM bill
WHERE MONTH(payment_date) = 12
ORDER BY no_of_bills DESC;