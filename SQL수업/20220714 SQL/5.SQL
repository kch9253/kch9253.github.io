select name, LifeExpectancy from country;

select case when 10 > 5 then '왼쪽이 오른쪽보다 큽니다'
				else '왼쪽이 오른쪽보다 작거나 같습니다.' end; -- case when(조건식) 참이면 then 값 / 거짓이면 else 값
                
select case when 10 > 5 then "왼쪽"
			when 10 = 5 then "같음"
			when 10 < 5 then "오른쪽"
			end as '비교';
            
select name , case when lifeexpectancy is null then 0.0 else LifeExpectancy end as life from country;

-- 직원 이름 (이름 + 성) 결합시킨 full name
-- 전화번호가 011로 시작하는경우 '개인전화' , 그외의 경우 '내선번호' 라고 별명은 '분류' 조회
select * from employees;