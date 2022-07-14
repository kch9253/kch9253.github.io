-- restaurants
-- name : VARCHAR(15)
-- phoneNumber : VARCHAR(14)
-- address : VARCHAR(100)

USE my_db;
CREATE TABLE restaurants (
	id INT PRIMARY KEY AUTO_INCREMENT
    , name VARCHAR(15) NOT NULL
    , phoneNumber VARCHAR(14) NOT NULL UNIQUE
    , address VARCHAR(100) NOT NULL UNIQUE
);

DESC restaurants;

INSERT INTO restaurants (name, phoneNumber, address)
	VALUES ('대모골', '1234-7890', '부전동 222-222')
		, ('영자면옥', '9874-6541', '부전동 111-111')
        , ('도연정', '4561-7561', '부전동 333-333');

SELECT * FROM restaurants;

-- menus
-- name : VARCHAR(15)
-- price : INT

CREATE TABLE menus (
	menuId INT PRIMARY KEY AUTO_INCREMENT
	, name VARCHAR(15) NOT NULL
    , price INT NOT NULL
);

INSERT INTO menus (name, price) VALUES ('고추장숯불정식', 8000), ('칼국수', 4000), ('짜장면', 3500);
INSERT INTO menus (name, price) VALUES ('칼국수', 3500);

SELECT * FROM menus;

ALTER TABLE menus ADD COLUMN restId INT;

UPDATE menus
SET restId = 2
WHERE menuId <> 1;

ALTER TABLE menus ADD CONSTRAINT FOREIGN KEY (restID) REFERENCES restaurants (id);


