SELECT id, total  FROM orders WHERE total=
(select max(total) from orders);