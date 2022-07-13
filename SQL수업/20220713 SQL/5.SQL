create table books (
	bookID int primary key auto_increment -- auto_increment = 정수형 pk의 키값을 자동적으로 정수형식으로 증강시켜준다
	, title varchar(30)                   -- 보통 여기서 auto_increment 없이 pk만 선언하면 밑에 insert 부분에 선언을 해줘야하는데 
    , price int                           -- auto_increment 를 사용할경우 선언해줄필요없이 insert에 생성된 값들이 자동적으로 키값을 가지게된다
);
desc books;

insert into books (title,price) values 
("책1" , 2000), ("책2" , 3000), ("중복이름" , 2500), ("중복이름" , 3000)
, ("새로운책", 3500);

delete from books where bookID = 3; -- 3번의 키값을 지우고 테이블을 생성하면 3번의 키값만 지워지고 1,2,4 이렇게 순서가 나열된다

select * from books;

drop table books;