-- hr 부서 (departments) 테이블 모든 행과 열 조회alter
select * from departments;

-- 부서 명이 'IT%'로 시작하는 부서들 조회
select * from departments where DEPARTMENT_NAME like 'it%';

-- 60,210,230
-- 직원테이블
select * from employees where DEPARTMENT_ID in (
	select DEPARTMENT_ID from departments where DEPARTMENT_NAME like 'it%' -- 서브쿼리
);

-- 연봉 내림차순 정렬함
-- 전체 직원 연봉 상위 10명 연봉을 내림차순으로 보고 그 10명의 연봉을 오름차순으로 다시 정렬하기
select * from (
	select * from employees order by SALARY desc limit 10) as A  -- ()들어있는 값들을 A라는 별명을 지어줬다 // 별명을 지어주지않으면 에러뜸 
    order by SALARY asc; -- 서브쿼리 ()를 통해 상위 10명의 내림차순을 생성하고 그 10명의 연봉을 오름차순으로 다시 생성했다  
     
-- 연봉 상위 10명 연봉을 오름차순으로 보고싶음 // 밑에 값은 전체직원의값 중 연봉이 낮은순으로 10명이 선정되기때문에 위의 값과 맥락이 다르다 (위에맥락은 상위10명 연봉 먼저뽑고 그 10명중 연봉낮은순으로 나열한거임)
select * from employees order by SALARY asc limit 10;

select (select 1+1),2,3,4;


-- david austin 의 연봉과 같은 연봉을 받는 직원들 조회
select * from employees where FIRST_NAME = 'david' and LAST_NAME = 'austin';
-- 조회함
select * from employees where SALARY = (
	select SALARY from employees where FIRST_NAME = 'david' and LAST_NAME = 'austin'
);




