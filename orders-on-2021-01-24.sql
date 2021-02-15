/*Select id, order_date from orders where order_date;*/

select id, order_date from orders
where cast(order_date as date)='2021-01-24';