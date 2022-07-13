select * from employees;
-- 각 직원들의 이름과 연봉, 평균연봉과의 차(연봉 - 평균연봉) 를 조회해보세요
-- 최고 연봉직원과 최저 연봉직원들의 이름을 조회해보세요
-- 평균연봉보다 높게 받는 직원조회
-- 부서명이 it로 시작하는 직원들의 수를 조회
-- douglas grant의 이메일을 'dog@naver.com' 으로 변경
-- ellen abel 과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬 조회
-- 부서명이 it로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 직원 목록을 연봉 오름차순으로 조회
-- 자기가 속한 부서의 평균보다 많이받는 직원


select LAST_NAME, SALARY from employees order by SALARY desc limit 1;

select count(*) from employees where JOB_ID like 'it%';


select * from employees  where FIRST_NAME ;
-- , min(salary) from employees;


