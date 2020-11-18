use test;
drop procedure if exists update_point;
delimiter //
create procedure update_point(
in in_st_num int
)
begin
declare _sum int default 0;
set _sum = 
(select sum(su_point) from attend
join course on co_num = at_co_num
join subject on su_num = co_su_num
join student on st_num = at_st_num
where at_st_num = in_st_num and at_pass = 'Y');

update student set st_point = _sum
where st_num = in_st_num;
-- select * from student;
end //
delimiter ;
call update_point(2020123001);