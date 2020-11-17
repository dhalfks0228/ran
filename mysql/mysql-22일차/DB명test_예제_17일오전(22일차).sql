use test;
SELECT * FROM test.attend;
-- 교수번호가 2010160001인 교수님의 지도학생수를 출력하는 쿼리문
select count(gu_st_num) as '학생수' from guide
where gu_pr_num = '2010160001';
-- at_mid, at_final, at_attend, at_homework 성적을 이용하여 
-- A, B, C, D, F를 at_score에 수정하는 쿼리문
update attend set at_score = if(at_mid + at_final + at_attend + at_homework >=90 , 'A', 
if(at_mid + at_final + at_attend + at_homework >= 80, 'B', 
if(at_mid + at_final + at_attend + at_homework >= 70, 'C', 
if(at_mid + at_final + at_attend + at_homework >= 60, 'D','F'))));
update attend join course on co_num = at_co_num set at_score = 
case when at_mid + at_final + at_attend + at_homework >=90 then 'A'
when at_mid + at_final + at_attend + at_homework >=80 then 'B'
when at_mid + at_final + at_attend + at_homework >=70 then 'C'
when at_mid + at_final + at_attend + at_homework >=60 then 'D' else 'F' end
where at_co_num = 1 or at_co_num = 3 or at_co_num = 4;
update attend set at_score = null;
-- where at_co_num = 2 or at_co_num = 5 or at_co_num = 6;
SELECT * FROM test.attend;
-- at_co_num가 1인 강의의 학생들 이름과 성적을 출력하는 쿼리문.
select su_title as '과목명', st_name as'이름', at_score as'성적' from attend 
join student on at_st_num = st_num
join course on at_co_num = co_num
join subject on co_su_num = su_num
where at_co_num = 1;
-- 과목명이 대학수학이고, 2020년 1학기 강의를 수강한 학생들의 이름과 성적 츨력
select st_name as'이름', at_score as'성적' from attend 
join student on at_st_num = st_num
join course on at_co_num = co_num
join subject on co_su_num = su_num
where su_title = '대학수학' and co_year = 2020 and co_term = 1;
-- 홍길동 교수님이 2020년 2학기에 수업하는 강의리스트를 출력하는 쿼리문
select * from course;
select su_title as '과목명' from course
join professor on co_pr_num = pr_num
join subject on co_su_num = su_num
where pr_name = '홍길동' and co_year = 2020 and co_term = 1;
-- 과목명이 '대학수학'이고, 2020년 1학기 강의를 수강한 학생 중
-- 성적별 학생 수를 출력하는 쿼리문
select at_score as'학점', count(at_score) as '인원수' from attend 
join course on at_co_num = co_num
join subject on co_su_num = su_num
where su_title = '대학수학' and co_year = 2020 and co_term = 1
group by at_score order by at_score;
select * from attend;
-- 김영철 학생이 수강했거나 하고 있는 모든 강의리스트를 출력하는 쿼리문
select su_title from attend
join student on st_num = at_st_num
join course on co_num = at_co_num
join subject on su_num = co_su_num
where st_name ='김영철';

select su_title from attend
join course on co_num = at_co_num
join subject on su_num = co_su_num
join (select * from student where st_name = '김영철') as stdbuy
on st_num = at_st_num