select code AS '코드', name as '이름', population as '인구' from country;

-- 위의 조회 + surfaceArea(별명 면적) 컬럼을 추가로 조회
select code AS '코드', name as '이름', population as '인구' , surfaceArea AS "면적" from country;


select code AS '코드', name as '이름', population as '인구' , surfaceArea AS "면적" ,
 ROUND(Population / SurfaceArea , 1) AS '인구밀도' from country --  Population / SurfaceArea 각 행마다 따로따로 계산되어 결과나타남
 -- surfaceArea 가 50000 이하이면서 population 이 10000000 이상인 국가의 인구밀도를 조회하세요
 -- WHERE surfaceArea <= 50000 AND Population >= 10000000;
 
 -- 인구 밀도 조회
 order by 인구 DESC;
 
-- 아시아 대륙 국가들의 인구 순으로 (내림차순) 조회
select * from country where Continent = 'Asia' order by Population DESC;

-- 인 LifeExpectancy 오름차순 조회 + null 값 제외
select * from country 
where LifeExpectancy is not null
order by LifeExpectancy ASC ;

-- 국가의 이름과 인구와 gnp , gnpold (gnpold - gnp 차를 구해서 'gnp 변화량' 내림차순) 조회
select name, population, gnp, gnpold, gnpold - gnp AS "gnp 변화량" 
from country 
where gnp is not null AND gnpold is not null
ORDER BY `gnp 변화량`;

-- 대륙 순으로 정렬해서 조회 , 정렬에대한 기준을 추가적으로 제시가능
select * from country order by Continent, Population;

-- GovernmntForm 오름차순 , GNP 내림차순 정렬조회
select * from country order by GovernmntForm, gnp DESC;

 
  
 