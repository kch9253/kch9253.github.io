select * from country where name NOT IN ('south korea ' , 'japan' , 'china');

select * from country where Population NOT between 40000000 AND 50000000;

-- Continent 컬럼 값이 north america , europe , asia 를 제외한 국가들 중 
-- gnp 값이 100 이상 1000이하인 국가목록 조회하기
select * from country where Continent NOT IN ('North America' , 'Europe' , 'Asia') AND gnp between 100 AND 1000;


select * from country;

-- IndepYear 안의 값이 null 값인 애들만 나타내라
select * from country where IndepYear is not null;

