SELECT * FROM country
WHERE Name LIKE '%Korea%';

SELECT * FROM country
WHERE NAME LIKE '%K%';

SELECT * FROM country
WHERE NAME LIKE '%K';

SELECT * FROM country
WHERE NAME LIKE 'K%';

-- 국가명이 'A'로 시작하고 'A'로 끝나는 국가 조회
SELECT * FROM country
WHERE NAME LIKE 'A%A';

-- 국가명이 'A'로 시작하고 'A'로 끝나는 국가 조회 (6글자)
SELECT * FROM country
WHERE NAME LIKE 'A____A';

-- 국가명이 ~ria로 끝나는 국가 조회
SELECT * FROM country
WHERE NAME LIKE '%ria';

-- Region 컬럼이 North~~로 시작하는 국가 조회
SELECT * FROM country
WHERE Region LIKE 'North%';

-- Region 컬럼에 A로 시작해서 a로 끝나는 명칭을 포함하지 않는 국가
SELECT * FROM country
WHERE Region NOT LIKE '%a%a' AND Region NOT LIKE 'a%a%';