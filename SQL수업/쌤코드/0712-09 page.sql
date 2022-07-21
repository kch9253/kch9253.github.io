총 행의 개수 239 행
한페이지에 10개씩 보여준다고
총페이지 =? 24
1페이지를 보여줄려면 몇개를 건너뛰고 몇개를 보여줘야함? 0 (페이지번호 - 1) * 10, 10
2페이지? 10, 10
3페이지? 20, 10
4페이지? 30, 10











-- SET @rowCount := 239;
-- ##에 임의의 입력 하시면 됩니다.
-- SET @pageNumber := 1;
-- SET @pagePer := 100;
-- SET @totalPage := ??; -- 총페이지 수(계산 수식 작성)

-- 239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자 하는 페이지 번호를 정하면
-- 해당 row들을 조회할 수 있는 SELECT 문을 작성해보기

-- PREPARE STMT FROM 'SELECT * FROM country LIMIT ?';
-- EXECUTE STMT USING @pagePer;