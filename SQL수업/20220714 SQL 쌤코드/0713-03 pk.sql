DROP DATABASE my_db;

CREATE DATABASE my_db;

USE my_db;

CREATE TABLE students (
	number INT PRIMARY KEY
    , name VARCHAR(10)
    , age INT
    , score DOUBLE
);

-- 주요 키 (PRIMARY KEY) : NOT NULL, UNIQUE

DESC students;

INSERT INTO students (number, name, age, score) VALUES (1234, '길동', 20, 3.3);
INSERT INTO students (number, name, age, score) VALUES (1235, '둘리', 30, 4.4);
INSERT INTO students (number, name, age, score) VALUES (1236, '길동', 20, 3.3);

SELECT * FROM students;







