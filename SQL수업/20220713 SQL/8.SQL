create table menus (
	menuId int primary key auto_increment
    , name varchar(15)
    , price int
);

desc menus;

insert into menus (name,price) values ('고추장숯불정식',8000), ('칼국수',4000), ('짜장면',3500), ('칼국수',4500);

alter table menus ADD column foodid int not null;  -- 테이블구조를 변경하기위해 새로운 컬럼을 생성

update menus -- 업데이트하고
set foodid = 2; -- foodid의 키값을 2번으로 변경하고
-- where menuId <> 1; // menuid의 키값이 1번이 아니다라고 부정값을 넣어주면 됨

alter table menus add constraint foreign key (foodid) references foods (키값); -- 외래키

select * from menus; 

drop table menus;