CREATE TABLE Seat (
                          id SERIAL PRIMARY KEY,
                          student VARCHAR NOT NULL
);


INSERT INTO Seat (id, student) VALUES
                                       (1, 'Abbot'),
                                       (2, 'Doris'),
                                       (3, 'Emerson'),
                                       (4, 'Green'),
                                       (5, 'Jeames');

SELECT(
          CASE WHEN id % 2 = 1 and  id = (select max(id) from Seat) THEN id
               WHEN id % 2 = 1 THEN id + 1
               WHEN id % 2 = 0 THEN id - 1
              END ) AS id, student
FROM Seat
ORDER BY id

