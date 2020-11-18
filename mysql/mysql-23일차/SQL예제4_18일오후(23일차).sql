-- 대학수학을 수강했던 모든 학생의 수
select sum(co_attendee) from course
join subject on su_num = co_su_num
where su_title = '대학수학';
-- 김영철 학생이 들었던 강의 정보를 출력(연도, 학기, 과목명 순으로 출력)
select co_year, co_term, su_title from attend
join course on co_num = at_co_num
join subject on su_num = co_su_num
join student on st_num = at_st_num
where st_name = '김영철' order by co_year asc, co_term asc;

select co_year, co_term, su_title from attend
join course on co_num = at_co_num
join subject on su_num = co_su_num
join (select * from student where st_name = '김영철') as std 
	on st_num = at_st_num
order by co_year asc, co_term asc;

-- 김영철 학생의 지도 교수님 이름을 출력
select st_name as '지도학생', pr_name as '지도교수' from guide
join (select * from student where st_name = '김영철') as std 
	on st_num = gu_st_num
join professor on pr_num = gu_pr_num;

-- 강의 중 재수강 과목이면 at_repitition에 Y로 수정하세요. 
-- 수정 과정을 주석으로 설명하세요.
select * from attend;
-- co_year <= 2020 이고, co_trem = 1  이면서, at_score ='F' at_pass = 'N' 이면 재수강.

-- 2020년도에 개강한 강의 리스트
select su_title as '강의리스트' from course
join subject on su_num = co_su_num
where co_year = 2020 and co_term = 2;

