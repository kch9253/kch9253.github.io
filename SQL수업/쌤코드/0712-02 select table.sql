DESC country;

SELECT * FROM country;

SELECT * FROM city;

SELECT Name, Population FROM country;

-- country 테이블 Code 열과 GNP 열을 조회해보세요.
SELECT Code, GNP FROM country;

SELECT * FROM country WHERE Name = 'South Korea';
-- 국가명이 'Japan'인 행의 모든 컬럼 조회
SELECT * FROM country WHERE Name = 'Japan';
-- 국가명이 'China'인 행의 모든 컬럼 조회
SELECT * FROM country WHERE Name = 'China';

-- Continent 컬럼 값이 'Asia'인 행 조회하기
SELECT * FROM country WHERE Continent = 'Asia';

SELECT * FROM country WHERE Name = 'South Korea' OR Name = 'Japan' OR Name = 'China';

-- Population(인구) 컬럼 값이 40,000,000 이상인 국가의 모든 컬럼을 조회
SELECT * FROM country WHERE Population >= 40000000;
-- Population(인구) 컬럼 값이 40,000,000 이상이고 50,000,000이하인 국가의 모든 컬럼을 조회
SELECT * FROM country WHERE Population >= 40000000 AND Population <= 50000000;

-- Continent 값이 'Asia'를 제외한 국가 목록 조회
SELECT * FROM country WHERE Continent <> 'Asia';