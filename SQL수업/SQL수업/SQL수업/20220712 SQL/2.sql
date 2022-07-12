select * From country;

select * From city;

select Name, Population From country;

desc country;

select code, Gnp from country;

select * from country where name = "South Korea"; 

select * from country where name = "JAPAN"; 

select * from country where name = "CHINA";

select * from country where Continent = "Asia";

 
 
 
 
 
select * from country where name = 'south korea' OR name = 'japan' AND name = 'china';
 -- Population(인구) 컬럼값이 4천만 이상인 국가의 모든 컬럼 조회
select * from country where Population >= 40000000;
 -- Population(인구) 컬럼값이 4천만 이상 5천만 이하인 국가의 모든 컬럼 조회
select * from country where Population >= 40000000 AND Population < 50000000;
 
 
select * from country where Continent <> 'Asia';
 
 
 
 
 