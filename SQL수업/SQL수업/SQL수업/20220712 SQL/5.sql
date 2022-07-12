select * from country;

-- select * from country limit 1 OFFSET 2; -- offset 건너뛰는기능 offset 1 의 경우 한칸건너뛰고
-- select * from country limit 2, 1; -- 위 OFFSET 의 기능과같다 2개의 리밋값에서 OFFSET 값 1 을 출력한다 

-- page 나누기 할때 주로쓰임
select * from country limit 10 offset 0; -- 건너뛰지않은 10개의 값만 보여달라
select * from country limit 10 offset 10; -- 10개를 건너뛴 10개의 값만 보여달라
select * from country limit 10 offset 20; -- 20개를 건너뛴 10개의 값만 보여달라