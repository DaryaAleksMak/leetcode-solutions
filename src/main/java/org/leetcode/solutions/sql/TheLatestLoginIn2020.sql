CREATE TABLE Logins (
                             user_id INT NOT NULL,
                             time_stamp TIMESTAMP NOT NULL,
                             PRIMARY KEY (user_id, time_stamp)
);

INSERT INTO Logins (user_id, time_stamp) VALUES
                                                  (6, '2020-06-30 15:06:07'),
                                                  (6, '2021-04-21 14:06:06'),
                                                  (6, '2019-03-07 00:18:15'),
                                                  (8, '2020-02-01 05:10:53'),
                                                  (8, '2020-12-30 00:46:50'),
                                                  (2, '2020-01-16 02:49:50'),
                                                  (2, '2019-08-25 07:59:08'),
                                                  (14, '2019-07-14 09:00:00'),
                                                  (14, '2021-01-06 11:59:59');


INSERT INTO Logins (user_id, time_stamp) VALUES
                                                  (6, '2020-06-30 15:06:07'),
                                                  (6, '2021-04-21 14:06:06'),
                                                  (6, '2019-03-07 00:18:15'),
                                                  (8, '2020-02-01 05:10:53'),
                                                  (8, '2020-12-30 00:46:50'),
                                                  (2, '2020-01-16 02:49:50');


SELECT distinct on (user_id) Logins.user_id, max(Logins.time_stamp) as last_stamp from Logins
where time_stamp between '2020-01-01 00:00:00' and '2020-12-31 23:59:59'
group by Logins.user_id
