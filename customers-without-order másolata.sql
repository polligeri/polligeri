select count(customers.id) as not_ordered_yet from customers left join orders on customers.id=orders.id
where total IS NULL;