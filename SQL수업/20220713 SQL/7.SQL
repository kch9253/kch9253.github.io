-- 식당정보 테이블
-- 상호명
-- 전화번호
-- 주소
-- 음식명
-- 가격
create table foods (
	keyy int primary key auto_increment
    ,상호명 varchar(20) not null
    ,전화번호 varchar(20) not null 
    ,주소 varchar(20) not null
    ,메뉴 varchar(20) not null unique
    ,가격 int not null
);

desc foods;

insert into foods (상호명,전화번호,주소,메뉴,가격) values ('한솥도시락','051-123-1234','서면','불족발도시락',8500)
													, ('명자면옥', '051-125-1234', '서면', '칼국수', 3500)
                                                    , ('명자면옥', '051-125-1234', '서면', '짜장면', 3000)
                                                    , ('명자면옥', '051-125-1234', '서면', '돈까스', 4500)
                                                    , ('명자면옥', '051-125-1234', '서면', '비빔밥', 3000)
                                                    , ('명자면옥', '051-125-1234', '서면', '만두', 2500);                                                   												
select * from foods;

drop table foods;
-- 메뉴정보 테이블
