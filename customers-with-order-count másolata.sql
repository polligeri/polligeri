select customers.names as name, sum(orders.id) as number_of_orders
from orders, customers
where customers.id=orders.id
group by customers.names  
order by customers.names;