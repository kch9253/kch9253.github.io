SELECT * FROM country;
-- SELECT * FROM country LIMIT 1 OFFSET 2;
-- SELECT * FROM country LIMIT 2, 1;

-- page 나누기
SELECT * FROM country LIMIT 10 OFFSET 0;
SELECT * FROM country LIMIT 10 OFFSET 10;
SELECT * FROM country LIMIT 10 OFFSET 20;