-- hr 데이터 베이스 사용하기 명령어 작성

-- 1.employees (직원) 테이블의 구조(어떠한 컬럼이 있는지)를 조회해보세요.
-- 2.employees 테이블의 모든 행의 모든 열을 조회해보세요.
-- 3.직원 테이블의 First_Name(이름) 열의 값이 'jonh' 인 직원 조회
-- 4.직원 테이블의 Last_name 열의 값이 'jonh을 포함하는 값인 직원 조회
-- 5.직원 테이블 이름의 값이 6글자인 직원 조회
-- 6.직원 테이블 salary(연봉) 열의 값이 10000~15000인 직원 조회
-- 7. 직원 테이블의 이름,성,연봉,컬럼과 연봉의 6% 연산하여 'tax' 라는 별명의 컬럼으로 조회하세요 

select * from hr.employees; -- 1번
select * from employees where FIRST_NAME = 'John'; -- 3번
select * from employees where LAST_NAME like '%john%'; -- 4번
select * from employees where FIRST_NAME like '______'; -- 5번
select * from employees where salary between 10000 AND 15000 ; -- 6번
select FIRST_NAME as '이름' , LAST_NAME as '성' , salary as '연봉' , round(salary%6) as 'txt' from employees; -- 7번



