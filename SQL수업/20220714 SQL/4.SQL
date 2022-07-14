select * from employees;

desc employees;

-- mysql 날짜 : date
-- 시간 : time
-- 날짜시간 : datatime / timestamp

select current_date(); -- 현재날짜 나옴
select current_time(); -- 현재시간
select current_timestamp(); -- 현재 날짜 시간 나옴

select date '2022-07-14';
select time '12:05:33';

-- hire_date가 1987년 6월인 애들 전부다
select * from employees
where HIRE_DATE between '1987-06-01' and '1987-06-30';

select adddate('1987-06-01', 40); -- 6월1일기준으로 40일더함
select subdate('1987-06-01', 1); -- 6월1일 기준으로 1일뺌
select date_add('1987-06-01', interval 40 day); -- 6월1일 기준으로 40일과의 간격 격차를 나타내줌
select date_sub('1987-06-01', interval 1 month); -- 6월1일 기준으로 한달 간격 격차
select '1987-06-01' + interval 1 year; -- 1년 간격차
select '1987-06-01' + interval 1 day; -- 1일 간격차

select dayofweek('2022-07-14'); -- 1 일요일

select extract(year from '2022-07-14'); -- 년 나타내줌
select extract(month from '2022-07-14'); -- 월 나타내줌
select extract(day from '2022-07-14'); -- 일 나타내줌

select datediff('2022-06-13' , '2022-06-01'); -- 13일 에서 01일 을 뺀값

select str_to_date('2021/06/13' , '%Y/%m/%d'); -- %Y 는 무조건 대문자로표기해야함 // %%%얘들이 앞에 2021/06/13 을 인식하여 표기됨
select date_format(date '2021-06-13' , '%y/%M/%D'); -- YMD 를 소문자든 대문자든 어떻게 표현하면 값이달라짐

-- 17일에 고용된 직원목록
select * from employees
where extract(day from hire_date) = 17;

select * from employees
where HIRE_DATE like '%-17';

-- job_history 각 행별로 일한 '기간'(일수로) 조회 
select START_DATE, END_DATE, datediff(end_date, start_date) as inte from job_history;

-- 자료형 숫자 , 문자열 , 날짜
select cast(10 as time);
select cast(10 as double) + 5.5;
-- 위아래 같은조건값임
select convert(10, time);
select convert(10, double) + 5.5;


