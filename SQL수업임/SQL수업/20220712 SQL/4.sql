select * from country
where name like '%korea%'; -- % 안에 입력된값을 기준으로 %가 앞에있으면 OO Korea 조회가능 , % 뒤에있으면 korea OO 조회가능

select * from country 
where name like '%k'; -- k가 마지막으로 끝나는 문자의 값만 출력된다. k% 가 될경우 k로 시작하는 문자의 값이 출력된다

select * from country 
where name like 'a%a'; -- a로 시작하고 a로 끝나는

-- 국가명이 a로 시작하고 a 로끝나는 국가조회 (6자)
select * from country
where name like 'a____a'; -- 6자 문자를 조회하기위한

-- 국가명이 ~ria 로 끝나는 국가 조회
select * from country
where name like '%ria';

-- region 컬럼이 north~~ 로 시작하는 국가 조회
select * from country
where region like 'north%';

-- region 컬럼 a로 시작해서 a로 끝나는 명칭을 포함하지않는 국가
select * from country
where region not like '%a%a' AND region not like 'a%a%';

select * from country;
 