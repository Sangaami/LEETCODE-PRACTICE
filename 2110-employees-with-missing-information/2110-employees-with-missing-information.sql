SELECT s.employee_id
FROM salaries s
LEFT JOIN employees e ON e.employee_id = s.employee_id
WHERE e.employee_id IS NULL

UNION

SELECT e.employee_id
FROM employees e
LEFT JOIN salaries s ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL 
order by employee_id asc;

