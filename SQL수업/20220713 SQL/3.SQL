-- 학생
-- 이름 : 가변길이문자열(10)
-- 학점 : 실수

create table students (
	name varchar(10)
    , age int
    , score double
);

desc students;

insert into students (name, age , score) values ('길동', 20 , 3.3), ('길동', 21 , 2.6), ('둘리', 20.5, 3); -- 정수값에 20.5를 넣었는데 에러가안뜨고 반올림되어 출력된다 
delete from students where name = '둘리'; -- 둘리라는 행을 지워버림 (나이,점수도 다날아감)

select * from students;

drop table students;