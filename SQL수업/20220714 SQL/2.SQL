-- 직계 / 같은값을 가지는 행들끼리 그룹을만들고 그 그룹을 직계로만들수있다
-- 부서별로 직원들의 인원수 
select DEPARTMENT_ID, COUNT(*) FROM employees 
	group by DEPARTMENT_ID;

-- 부서별 최고연봉 , 최저연봉 , 평균연봉, 연봉합
select DEPARTMENT_ID, (SALARY), min(SALARY), AVG(SALARY), SUM(SALARY)
FROM employees
group by DEPARTMENT_ID; -- GROUP BY 는 직계함수에 주로 사용한다 (여러행을 나타내기위한)

select JOB_ID , LAST_NAME FROM employees group by JOB_ID;
select distinct JOB_ID , LAST_NAME FROM employees; -- distinct 조회하고자하는 컬럼값들의 행이 값이 완벽하게 똑같아야 중복을 제거해준다

-- 직원 테이블 LAST_NAME을 중복 제거하고 조회
select distinct LAST_NAME FROM employees; 

-- 직원 테이블 LAST_NAME 그룹 별로 인원수 조회
select distinct LAST_NAME , count(*) FROM employees group by LAST_NAME;

-- LAST_NAME 그룹의 카운트가 2이상인 행들만 조회
select distinct LAST_NAME , count(*) 
FROM employees group by LAST_NAME having count(*) > 1; -- HAVING = 그룹에대한 조건을 사용하고자할때 쓰임

-- 위의 성을 가지는 직원목록조회
select * FROM employees where LAST_NAME IN (
	select LAST_NAME 
		FROM employees group by LAST_NAME having count(*) > 1
);

-- 5번째로 적게 받는 직원들 목록
select * FROM employees
WHERE SALARY = (
select distinct SALARY FROM employees order by SALARY limit 1 offset 4);

-- 상위 연봉 50명 (같은 연봉에 대해서 FIRST_NAME이 빠른친구)에 대해서 부서별로 몇명씩 있는지
select DEPARTMENT_ID, count(*) FROM 
(select * FROM employees order by SALARY DESC , FIRST_NAME ASC limit 50) AS A group by DEPARTMENT_ID;


