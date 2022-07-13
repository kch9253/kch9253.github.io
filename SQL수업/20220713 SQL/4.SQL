drop database my_db; -- 데이터 다날려버림

create database my_db;

use my_db;

create table students(
	키값 int primary key -- primary key = number 이 고유의키값을 가지기위한조건 // pk같은경우 null값을 허용하지않는다 무조건값 있어야함
	, 이름 varchar(10)         -- pk 의 키값은 중복불가다 (1이라는 키값을 쓰면 1은 더이상못씀 중복x)
    , 나이 int
    , 점수 double
);

desc students;

insert into students (키값, 이름, 나이, 점수) values (1, '길동', 20, 3.3); 
insert into students (키값, 이름, 나이, 점수) values (2, '둘리', 30, 4.4);

select * from students;

drop table students;
