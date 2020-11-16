SELECT * FROM example.attend;
update attend set at_repetition = 'y'
where at_score ='F';
select std_name as'재수강 명단' from student  
join attend on std_num = at_st_num 
where attend.at_repetition = 'y';
select std_name as '이름', co_name as '과목명', co_professor as'담당교수', co_timetable as'시간표' from course
join attend on co_code = at_co_num
join student on std_num = at_st_num
order by std_name;
select co_name as '과목명' , avg(at_final) as'기말평균', avg(at_mid) as '중간평균' from attend 
join course on at_co_num = co_code
group by co_name;

