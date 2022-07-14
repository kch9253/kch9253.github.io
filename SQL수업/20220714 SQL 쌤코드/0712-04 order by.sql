SELECT Code AS "코드", Name AS "이름", Population AS "인구" FROM country;

-- 위의 조회 + SurfaceArea(별명 면적) 컬럼을 추가로 조회
SELECT Code AS "코드", Name AS "이름", Population AS "인구", SurfaceArea AS "면적" FROM country;

-- SurfaceArea가 50,000이하이면서 Population이 10,000,000 이상인 국가의 인구밀도를 조회하세요.
SELECT Code AS "코드", Name AS "이름", Population AS "인구", SurfaceArea AS "면적"
	, ROUND(Population / SurfaceArea, 1) AS "인구밀도"
 FROM country
 WHERE SurfaceArea <= 50000 AND Population >= 10000000;
 
-- 인구 밀도 조회
SELECT Code AS "코드", Name AS "이름", Population AS "인구", SurfaceArea AS "면적"
	, ROUND(Population / SurfaceArea, 1) AS "인구밀도"
 FROM country
 ORDER BY 인구밀도 DESC;
 
-- 아시아 대륙 국가들의 인구 순으로(내림차순) 조회
SELECT *
	FROM country
    WHERE Continent = 'Asia'
    ORDER BY Population DESC;
    
-- LifeExpectancy 오름차순으로 조회 (NULL 값을 제외한 행)
SELECT * FROM country
 WHERE LifeExpectancy IS NOT NULL
 ORDER BY LifeExpectancy ASC;
 
-- 국가의 이름과 인구와 GNP, GNPOld, (GNPOld - GNP 차를 구해서 "GNP 변화량" 내림차순) 조회
SELECT name, population, gnp, gnpold, gnpold - gnp AS "GNP 변화량"
 FROM `country`
 WHERE gnp IS NOT NULL AND gnpold IS NOT NULL
 ORDER BY `GNP 변화량`;
 
-- 대륙 순으로 정렬해서 조회
SELECT * FROM country ORDER BY Continent, Population;

-- GovernmentForm 오름차순, GNP 내림차순 정렬 조회
SELECT * FROM country ORDER BY GovernmentForm, GNP DESC;