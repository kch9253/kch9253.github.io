create database my_db;

show databases;

use my_db;

show tables;

-- 사람 테이블 만들자
-- 사람의 정보를 열로 만들어보자
-- 열 1 이름 문자열
-- 열 2 나이 정수
create table persons (
	name varchar(10), -- name 이라는 테이블을 생성할때 문자열로 정하는데 문자열의 길이도 같이정해줘야한다 필수조건  
    age INT           -- varchar 은 문자열생성값 // (10) 은 문자열길이
);
desc persons; -- 생성한 테이블 함보자

insert into persons (name, age) values ("홍길동", 22);
-- values = 행안에 넣고자하는 정보를 입력하기위한 // 앞전에 (이름,나이) 를 values 를통해 전달하여 ()안에 입력된값이 생성된다.

insert into persons (name, age) values ("브루스리", 30);
insert into persons (name, age) values ("스티븐킹", 40);
-- (age, name) 순서를 바꾸고 (나이,이름) 이렇게 입력해도 해당 테이블행 안에 입력값들이 그대로 생성된다
insert into persons (name, age) values ("철수" , 20),("철수" , 30),("철수" , 40);
-- 넣고자하는 행의 값을 (),(),() 이런식으로 나열해서 한꺼번에 입력해도된다

delete from persons; -- 테이블안에 있는 모든 행들을 지우기위한 // 테이블은 안지워지고 안에들어있는 행들만 지워짐

drop table persons; -- 테이블자체를 날려버림


-- 책 테이블 생성
-- 제목 : 문자열
-- 가격 : 정수

create table book (
	title varchar(20), -- name 이라는 테이블을 생성할때 문자열로 정하는데 문자열의 길이도 같이정해줘야한다 필수조건  
    price INT           -- varchar 은 문자열생성값 // (10) 은 문자열길이
);
-- char(5) 고정된 길이값속성 / 예를 들어 'A' 이렇게 하나를 입력할경우 고정된길이값 5중 A값 만 빠지고 'A    ' 이렇게 공백이생겨버린다 // 공백은 무조건 뒤에생긴다
-- varchar(5) 가변길이속성 / 'A' 하나만 입력해도 공백없이 5자리수 안에만 들어온다면 에러없이 그대로 출력된다 // 만약 5자리수를 넘어버린다면 에러뜬다 길이값을 넉넉하게 주는것이좋다


insert into book (title, price) values ("파워자바", 25000), ("하늘과 바람과 별과 시", 15000),("꽃을 보듯 너를 본다", 12000);

select * from book;

drop table book;



create table testChar (
	fixLength char(5),
		varLength varchar(5)
);

insert into testChar (fixLength, varLength) values ('a', 'a');

select * from testChar;

drop table testChar;


select RTRIM('A         '); -- RTRIM 우측에 있는 공백제거
select ltrim('         A'); -- ltrim 좌측에 있는 공백제거














  