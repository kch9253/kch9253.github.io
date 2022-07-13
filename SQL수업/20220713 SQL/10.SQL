-- 집계 함수
select * from employees;

select count(*) from employees; -- 직원수가 몇명인지 개수를 세줌 (행의 개수) // count(컬럼이름) 적어줘도 되는데 보통 (*) 를 통해 갯수를 센다 왜냐하면 다른 컬럼속에 null 값이 존재할수도있기때문에 null 값은 빠지고 출력된다

select * from employees where PHONE_NUMBER like '515%';

select count(*) from employees where PHONE_NUMBER like '515%';

-- 합을 구함
select sum(salary) from employees;
-- 평균
select avg(salary) from employees;
-- 최대 
select max(salary) from employees;
-- 최소 
select min(salary) from employees;

-- 최대 연봉과 최소 연봉의 차를 구해봅시다.
select max(salary) - min(salary) from employees;





