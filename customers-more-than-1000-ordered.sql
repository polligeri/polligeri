
select total, names, order_date from orders left join customers
on customers.id=orders.id where total>1000 order by order_date desc;