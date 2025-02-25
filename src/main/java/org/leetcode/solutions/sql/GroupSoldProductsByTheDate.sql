CREATE TABLE Activities (
                       sell_date DATE NOT NULL,
                       product VARCHAR NOT NULL
);

INSERT INTO Activities (sell_date, product) VALUES
                                           ('2020-05-30', 'Headphone'),
                                           ('2020-06-01', 'Pencil'),
                                           ('2020-06-02', 'Mask'),
                                           ('2020-05-30', 'Basketball'),
                                           ('2020-06-01', 'Bible'),
                                           ('2020-06-02', 'Mask'),
                                           ('2020-05-30', 'T-Shirt');

SELECT Activities.sell_date, count(distinct product) as num_sold , string_agg(distinct product, ',') as products from Activities
group by sell_date


