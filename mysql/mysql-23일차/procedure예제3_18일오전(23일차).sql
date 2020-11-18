-- 수강 테이블의 이수 여부가 N -> Y로 수정되면 학생 이수학점을 계산하는 트리거 생성
use test;
drop trigger if exists update_student_point;
delimiter //
create trigger update_student_point after update on attend
for each row
begin
if new.at_pass ='Y' then
call update_point(new.at_st_num);

end if;
call update_point(new.at_st_num);
end //
delimiter ;
select * from student;