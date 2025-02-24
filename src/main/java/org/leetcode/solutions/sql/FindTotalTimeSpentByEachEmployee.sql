CREATE TABLE Employees (
                                     emp_id INT NOT NULL,
                                     event_day DATE NOT NULL,
                                     in_time INT NOT NULL,
                                     out_time INT NOT NULL,
                                     PRIMARY KEY (emp_id, event_day, in_time)
                                 );


INSERT INTO Employees (emp_id, event_day, in_time, out_time) VALUES
                                                                           (1, '2020-11-28', 4, 32),
                                                                           (1, '2020-11-28', 55, 200),
                                                                           (1, '2020-12-03', 1, 42),
                                                                           (2, '2020-11-28', 3, 33),
                                                                           (2, '2020-12-09', 47, 74);


with temp_table as (SELECT *, Employees.out_time-Employees.in_time as sub_sum_empl_time
from Employees)
select temp_table.event_day as day, temp_table.emp_id, sum(sub_sum_empl_time) as total_time
from temp_table
group by emp_id , temp_table.event_day;
