-- 세션(session) 변수(variable)
set @myvar := 10; -- set @이름 = (세션) // := 값; = (변수)

select @myvar * 10 + 5; 
