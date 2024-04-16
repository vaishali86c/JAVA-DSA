drop table student_comp;
drop table competition;
drop table student;

create table student(stud_id int primary key, name varchar(30), class varchar(30));
create table competition(c_no int primary key, c_name varchar(30), type varchar(30));
create table student_comp(stud_id int references student(stud_id), c_no int references competition(c_no), rank varchar(30), year int);

insert into student values(1, 'sushant', 'fy');
insert into student values(2, 'vaishu', 'sy');
insert into student values(3, 'duggu', 'lkg');

insert into competition values(101, 'cricket', 'outdoor');
insert into competition values(102, 'snake ladder', 'indoor');

insert into student_comp values(1, 101, 'first', 2018);
insert into student_comp values(2, 102, 'second', 2019);
insert into student_comp values(3, 102, 'first', 2018);


select * from student;
select * from competition;
select * from student_comp;
