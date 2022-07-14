CREATE DATABASE my_db;

SHOW DATABASES;

USE my_db;

SHOW TABLES;

-- 사람 테이블
-- 열1 이름 문자열
-- 열2 나이 정수
CREATE TABLE persons (
	name VARCHAR(10),
    age INT
);

DESC persons;

SELECT * FROM persons;

INSERT INTO persons (name, age) VALUES ("홍길동", 22);
-- 행 추가
-- '브루스 리', 30살
INSERT INTO persons (name, age) VALUES ("브루스 리", 30);
-- '스티븐 킹', 40살
INSERT INTO persons (age, name) VALUES (40, "스티븐 킹");

-- '철수', 20살
-- '철수', 30살
-- '철수', 40살
INSERT INTO persons (name, age) VALUES ('철수', 20), ('철수', 30), ('철수', 40);

DELETE FROM persons; -- 테이블의 행 삭제

DROP TABLE persons;

-- 책 테이블 생성
-- 제목 : 문자열
-- 가격 : 정수

-- 파워자바, 25000
-- 하늘과 바람과 별과 시, 15000
-- 꽃을 보듯 너를 본다, 12000

CREATE TABLE books (
	title VARCHAR(25)
    , price INT
);

INSERT INTO books (title, price) VALUES ("파워 자바", 25000);
INSERT INTO books (title, price) VALUES ("하늘과 바람과 별과 시", 15000);
INSERT INTO books (title, price) VALUES ("꽃을 보듯 너를 본다", 12000);

SELECT * FROM books;

-- CHAR(5)
-- VARCHAR(5)

-- 'A    '
-- 'A'

CREATE TABLE testChar (
	fixLength CHAR(5)
    , varLength VARCHAR(5)
);

INSERT INTO testChar (fixLength, varLength) VALUES ('A', 'A');
-- SET sql_mode = 'PAD_CHAR_TO_FULL_LENGTH';
SELECT char_length(fixLength), char_length(varLength) FROM testChar;
SELECT CONCAT(fixLength, 'B') FROM testChar;

SELECT * FROM testChar WHERE fixLength = 'A';




SELECT RTRIM('A           ');
SELECT ltrim('           A');













