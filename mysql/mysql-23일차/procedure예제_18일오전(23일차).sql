-- 프로시저 목록 확인 : show procedure status;
-- show procedure status;
-- use example;
/* 
drop procedure if exists 프로시저명;
delimiter //
create procedure 프로시저명(
	in 매개변수명 자료형,  ----매개변수
    out 리턴타입명 자료형, ----리턴타입
)
begin
	쿼리문;
end //
delimiter; 
*/
-- call 프로시저명(매개변수, 리턴타입);
-- drop procedure if exists select_buy;
-- delimiter //
-- create procedure select_buy(
-- in in_name varchar(20),
-- in in_mode int
-- )
-- begin
-- 	if in_mode = 0 then
-- 		select * from buy where product_name = in_name;
-- 	end if; 
--  if in_mode <> 0 then
-- 		select customer from buy where product_name = in_name;
-- 	end if;
-- end //
-- delimiter ;
-- call select_buy('에이 나시',1);

-- attend 테이블에서 학생 성적을 합한 결과에 따라 at_score를 결정하는 프로시저를 생성하고 테스트하세요
-- 매개변수 : at_num
use test;
drop procedure if exists update_at_score;
delimiter //
create procedure update_at_score(
in in_at_num int
)
begin
declare _sum int default 0;
declare _score varchar(2) default null;
set _sum = (select (at_mid+at_final+at_attend+at_homework) from attend where at_num = in_at_num);

if _sum >=90 and _sum <=100 then
    set _score = 'A';
    elseif _sum >=80 then
    set _score = 'B';
    elseif _sum >=70 then
    set _score = 'C';
    elseif _sum >=60 then
    set _score = 'D';
    else  
    set _score = 'F';
end if;
update attend set at_score = _score 
where at_num = in_at_num;
select at_num, at_score from attend where at_num = in_at_num;
end //
delimiter ;
call update_at_score(1); 