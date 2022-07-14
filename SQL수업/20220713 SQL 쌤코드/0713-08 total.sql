-- 집계 함수
SELECT * FROM employees;

SELECT COUNT(*) FROM employees;

-- 전화번호가 515~~로 시작하는 직원을 조회하는 쿼리문
SELECT * FROM employees WHERE PHONE_NUMBER LIKE '515%';
-- 전화번호가 515~~로 시작하는 직원의 수를 조회하는 쿼리문
SELECT COUNT(*) FROM employees WHERE PHONE_NUMBER LIKE '515%';

-- 합
SELECT SUM(SALARY) FROM employees;
-- 평균
SELECT AVG(SALARY) FROM employees;
-- 최대
SELECT MAX(SALARY) FROM employees;
-- 최소
SELECT MIN(SALARY) FROM employees;

-- 최대 연봉과 최소 연봉의 차를 구해봅시다.
SELECT MAX(SALARY) - MIN(SALARY) FROM employees;