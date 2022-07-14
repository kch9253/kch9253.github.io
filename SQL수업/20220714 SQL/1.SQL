/*
varchar() = 문자열 String ()= 문자열길이
DESC OO = 원하는 테이블 호출
INSERT INTO OO () VALUES (); = 테이블안에 원하는 행의값을 만들수있다
DELETE FROM OO = 테이블 행삭제 // 원하는 행만찾아서 삭제를 원하면 WHERE 로 확실한 경로를 찾아서 삭제
DROP TABLE OO = 테이블 자체를 날려버림
RTRIM = 오른쪽공백제거 / LTRIM = 왼쪽공백제거

INT PRIMARY KEY = 테이블안의 각 행마다 고유의 키를 부여하는 (관리하기편함)
INT PRIMARY KEY AUTO_INCREMENT = 고유의키가 자동적으로 생성되게 // 이렇게 생성을할경우 INSERT 부분에서 호출안해줘도됨
UNIQUE = 선언 값 중복불가 
NOT NULL = 널값이 아니다 라고표기했기때문에 값이 무조건있어야함


ALTER TABLE OO ADD COLUMN OO INT = 외래키를 만들기위한
UPDATE OO
SET OO  
WHERE OO <> 
FOREIGN KEY () REPERENCES 어느테이블 (); = 외래키를 만듬

LIKE '%%' = ~~해당하는 값을찾자

COUNT(*) = 갯수세라
SUM() = 합 
AVG() = 평균
MAX() = 최고
MIN() = 최저
*/

-- 각 직원들의 이름과 연봉, 평균연봉과의 차(연봉 - 평균연봉)를 조회해보세요.
select FIRST_NAME , LAST_NAME, SALARY, ROUND(SALARY-(select AVG(SALARY) FROM employees), 2) AS GAP FROM employees;
						-- AVG(SALARY) 이렇게 평균연봉을 바로 호출할경우 직계이기때문에 모든행이 하나의행으로 나타나기때문에 위 방법대로 생성했다

-- 최고 연봉직원과 최저 연봉직원들의 이름을 조회해보세요.
select FIRST_NAME , LAST_NAME FROM employees WHERE SALARY IN 
((select MIN(SALARY) FROM EMPLOYEES) , (select MAX(SALARY) FROM EMPLOYEES));						

-- 평균 연봉보다 높게 받는 직원 조회
select * FROM employees
	WHERE SALARY > (select AVG(SALARY) FROM employees);

-- 부서명이 IT로 시작하는 직원들의 수(카운트)를 조회해보세요.
select count(*) FROM employees WHERE DEPARTMENT_ID IN (
					select DEPARTMENT_ID FROM departments where DEPARTMENT_NAME LIKE 'IT%');

-- Douglas Grant의 이메일을 'dog@naver.com'으로 변경해보세요.
UPDATE employees SET EMAIL = 'DOG@NAVER.COM' where FIRST_NAME = 'DOUGLAS' AND LAST_NAME = 'GRANT';
select * FROM employees where FIRST_NAME = 'DOUGLAS' AND LAST_NAME ='GRANT';

-- Ellen Abel과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
select * FROM employees where DEPARTMENT_ID = (
		select DEPARTMENT_ID FROM employees where FIRST_NAME = 'ELLEN' AND LAST_NAME = 'ABEL'
)order by SALARY DESC;

-- 부서명이 IT로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 직원 목록을 연봉 오름차순으로 조회
select * FROM employees where SALARY > (
	select MAX(SALARY) FROM employees WHERE DEPARTMENT_ID IN (
					select DEPARTMENT_ID FROM departments where DEPARTMENT_NAME LIKE 'IT%')
) order by SALARY ASC;

-- 자기가 속한 부서의 평균연봉보다 많은 연봉을 받는 직원
select * FROM employees;














