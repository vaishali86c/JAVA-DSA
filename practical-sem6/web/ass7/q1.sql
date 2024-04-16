drop table movie_actor;
drop table actor;
drop table movie;

create table movie (movie_no int primary key, movie_name varchar(30), release_year int);
create table actor (actor_no int primary key, actor_name varchar(30));
create table movie_actor (movie_no int references movie(movie_no), actor_no int references actor(actor_no), rate int );

insert into movie values (1, 'pathan', 2022);
insert into movie values (2, 'tere bato mai ulza jiya', 2024);
insert into movie values (3, 'jawan', 2023);

insert into actor values (111, 'sharukhan');
insert into actor values (222, 'shahid kapoor');
insert into actor values (333, 'salman khan');

insert into movie_actor values (1, 111, 1000000);
insert into movie_actor values (2, 222, 2000000);
insert into movie_actor values (3, 111, 3000000);

select * from movie;
select * from actor;
select * from movie_actor;