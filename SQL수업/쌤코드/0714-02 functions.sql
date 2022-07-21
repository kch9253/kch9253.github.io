SELECT * FROM employees;

SELECT RTRIM('    a      ');
SELECT LTRIM('        a      ');
SELECT TRIM('      a      ');

SELECT LOWER('ABCDE');
SELECT UPPER('abcde');

SELECT REVERSE('qwer');

SELECT CONCAT('문자열', '결합', '함수');
SELECT CONCAT("결합", NULL, "값이 있으면?");

SELECT CHAR_LENGTH('문자열길이');

SELECT REPLACE('원본 문자열에서 변환합니다', '변환', 'REPLACE');
SELECT REPLACE(1234, '1', '5');

SELECT SUBSTRING('employees', 5); -- 문자열, 자를 시작 위치
SELECT SUBSTRING('employees', 5, 2); -- 문자열, 자를 시작 위치, 개수
SELECT SUBSTRING('employees', -3); -- 음수일때 우측에서부터 위치를 세어나감
SELECT SUBSTRING('employees', -3, 2);

SELECT LPAD("123", 5, "0");
SELECT RPAD("456", 5, "*");
SELECT REPEAT("반복결합", 3);

SELECT LOCATE('D', 'ABCDEFG');
SELECT LOCATE('위치', '문자열의 위치를 찾는데 SQL의 문자 순서는 위치 1부터임');
SELECT LOCATE('A', 'ABABAB', 2);

-- "515.123.4567"
-- .을 기준으로 각각 잘라보셈

SELECT SUBSTRING("515.123.4567", 1, 3);
SELECT SUBSTRING("515.123.4567", 5, 3);
SELECT SUBSTRING("515.123.4567", -4, 4);

-- 직원 테이블 전화번호 앞자리 3자리로 그룹지어 개수
SELECT SUBSTRING(PHONE_NUMBER, 1, 3), COUNT(*)
FROM employees
GROUP BY SUBSTRING(PHONE_NUMBER, 1, 3);

-- 
SELECT RAND();
SELECT ROUND(123.123, 2);
SELECT FLOOR(1.555);
SELECT CEIL(1.222);

SELECT ABS(-55);
SELECT POW(2, 8);

SELECT PI();

-- 주사위 1 ~ 6사이의 난수(정수) 생성
SELECT CEIL(RAND() * 6);





