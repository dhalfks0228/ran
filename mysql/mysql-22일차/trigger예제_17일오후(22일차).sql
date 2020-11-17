-- SELECT * FROM example.product;
-- update product set amount = 100, sale_amount =0;
-- -- 트리거를 생성하면 해당 이벤트가 발생될 때 자동으로 실행됨. 
-- /* drop trigger if exists 트리거명;
-- delimter //  : 문장의 끝을 수정하는 것을 의미.
-- create trigger 트리거명 AFTER | BEFORE 이벤트 on 테이블명
-- for each row
-- begin
-- --  구현;
-- end //
-- delimiter;
--  */
--   -- example DB에 있는 buy 테이블에 행이 추가되면 추가된 행과 일치하는 제품의 제고량과 판매량이 변경되는 트리거
--   use example;
--  drop trigger if exists insert_buy;
--  delimiter //
--  create trigger insert_buy after insert on buy
--  for each row
--  begin
-- 	-- 변수 선언 방법
-- 	-- declare 변수명 자료형 기본값;
-- 	-- 변수의 값 설정 방법
--     -- set 변수명 = 값;
--     -- new : 이벤트가 발생한 행의 최신 데이터
--     -- old : 이벤트가 발생한 행의 이전 데이터(insert의 경우는 없음)
--     declare _amount int default 0 ;
--     set _amount = new.amount;
--     update product set 
-- 		amount = amount - _amount, 
--         sale_amount = sale_amount + _amount
--         where product.name = new.product_name;
--     end //
-- delimiter ;
-- select * from product;
-- example DB에 있는 buy테이블에 행이 변경되면 변경된 행과 일치하는 
-- 제품의 재고량과 판매량이 변경되는 트리거
-- use example;
-- drop trigger if exists update_buy;
-- delimiter //
-- create trigger update_buy after update on buy
-- for each row
-- begin
-- declare new_amount int default 0;
-- declare old_amount int default 0;
-- declare dif_amount int default 0;
-- set new_amount = new.amount;
-- set old_amount = old.amount;
-- set dif_amount = new_amount - old_amount;
-- update product set
-- amount = amount - dif_amount,
-- sale_amount = sale_amount + dif_amount
-- where name = new.product_name;
-- end //
-- delimiter ;
-- select * from product;
-- show triggers;
-- test DB에 있는 attend 테이블에 수강생이 추가되면
-- course테이블에 수강인원이 증가하는 트리거를 생성
use test;
drop trigger if exists insert_attend;
delimiter //
create trigger insert_attend after insert on attend
for each row
begin
declare _count int default 0;
set _count = (select count(*) from attend where at_co_num = new.at_co_num);
update course set
co_attendee = _count
where co_num = new.at_co_num;
end //
delimiter ;
select * from course;