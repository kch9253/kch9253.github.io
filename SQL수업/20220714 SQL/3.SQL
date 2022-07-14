SELECT * FROM employees;

select RTRIM('       A       '); -- 오른쪽 공백만제거
select ltrim('        A        '); -- 왼쪽 공백만제거
select TRIM('       A       ');

select lower('ABCDE'); -- 소문자변경
select upper('ABCDE'); -- 대문자변경

select reverse('QWER'); -- 뒤집는거

select concat('문자열', '결합', '함수'); -- ()안에 문자들결합시킴
select concat("결합", NULL, "값이 있으면?"); -- () 안에 NULL 값있으면 ()안에 입력된 모든값들 다 NULL값 됨

select char_length('문자열길이');

select replace('원본 문자열에서 변환합니다' , '변환', 'REPLACE'); -- REPLACE = 변환 // (안에 변환이라는 같은값이 없어짐)
select replace(1234 , '1', '5');

select substring('EMPLOYEES' , 5); -- 문자열 자를 시작 위치 (5번째 문자열부터 오른쪽으로 남은값들 나옴)
select substring('EMPLOYEES' , 5, 2); -- 문자열, 자를시작위치, 개수 (5번째 문자열에서부터 오른쪽으로 2번)
select substring('EMPLOYEES', -3); -- 음수일때 우측에서부터 위치를 세어나감 (우측에서부터 짜름)
select substring('EMPLOYEES', -3, 2); -- 우측에서부터 3개짜르고 그 값에서 다시 우측으로 2번세어감

select LPAD(123, 5, '0'); -- 123은 나타낼기본값 / 5는 길이수 / '0' 은추가할 문자열 (LPAD라 왼쪽으로 추가됨)
select RPAD("456", 5, "*"); -- 456은 나타낼기본값 / 5는 길이수 / "*" 은추가할 문자열 (RPAD라 오른쪽으로 추가됨)

select repeat("반복결합" , 3); -- 반복결합을 3번중복되게함

select locate('D', 'ABCDEFG'); -- D가 몇번째에 있는지 알려줌
select locate('위치', '문자열의 위치를 찾는데 SQL의 문자 순서는 1부터임'); -- '위치' 가 몇번째에 있는지알려줌

-- "515.123.4567"
-- . 을 기준으로 각각 잘라보셈
select substring("515.123.4567" , -4);
select substring("515.123.4567" , -8 , 3);
select substring("515.123.4567" , 1, 3);

-- 직원 테이블 전화번호 앞자리 3자리로 그룹지어 개수 
select substring(phone_number, 1, 3) , count(*) from employees
group by substring(phone_number, 1, 3);


select rand(); -- 0~1사이 랜덤
select round(123.123, 2);
select floor(1.555); -- 제일작은수
select ceil(1.222); -- 제일큰수

select abs(-55);
select pow(2, 8); -- 제곱

select pi(); -- 파이값

-- 주사위 1~6사이 정수생성
select ceil(rand() * 6);