create table persons (
	personID int primary key auto_increment
    , 성 varchar(10) not null -- not null 을 통해 성,이름,나이의 값이 null 이 아니다라고 정의내리기
    , 이름 varchar(10) not null
    , 나이 int not null
    , 이메일 varchar(50) not null unique -- unique 중복불가조건 // 사람들은 각각의 고유한이메일을 보유할수있다 
);													-- unique 혹여나 같은값이 입력될경우 행생성불가 에러뜸 / 중복조건x

-- insert into persons (성, 이름, 나이) values (null,null,null); // 위에 not null 값을 부여했기에 null값을 넣으면 에러뜸 
insert into persons (성, 이름, 나이, 이메일) values ('길동','홍',20,'길동@길동.net')
												, ('둘','리',21,'둘리@둘리.net');

desc persons;

select * from persons;

drop table persons;