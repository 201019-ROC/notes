-- This is a single line comment

/*
Naming conventions is snake_case, due to lack of case sensitivity
Keywords such as datatypes and constraints are uppercased
*/


-- DDL Examples
--create database demo;
--create schema name_of_schema;

-- If the table exists, it will not create a new one
create table if not exists users(
	id SERIAL primary key,
	first_name VARCHAR(30) not null,
	last_name VARCHAR(30) check (length(last_name) > 5),
	email VARCHAR(50) not null UNIQUE
);

create table if not exists posts(
	id SERIAL primary key,
	author_id INTEGER references users(id) not null,
	wall_user_id INTEGER references users(id) not null,
	post_content VARCHAR(500) not NULL
);

--alter table users
--	add column test INTEGER;

--alter table users
--	alter column test set data type VARCHAR(2);

-- Set a default value to a column
--alter table users 	
--	alter column test set default 'hi';
	
-- removes the column test
--alter table users 
--	drop column test;

-- Remove all table data, but leaves the table intact
--truncate table users;

-- removes table
--drop table posts;
-- We cannot drop the users table while posts exists since posts depends on users
--drop table users;

--Can drop users table using cascade which removes the foreign key relationship
--drop table users cascade;

create table if not exists likes(
	user_id INTEGER references users(id) not null,
	post_id INTEGER references posts(id) not null,
	primary key (user_id, post_id)
);

-- inserting 1 record
insert into users (first_name, last_name, email) values ('John', 'Doe123', 'john.doe@gmail.com');

-- inserting multiple records
insert into users (first_name, last_name, email) values
	('Dao', 'Vangoo', 'dao.vangoo@gmail.com'),
	('Chris', 'Gomes666', 'chris.gomes@gmail.com');
	

--insert into users (first_name, last_name, email) values ('Bernice', 'Manouria emys', 'bbiermatowicz0@ibm.com');
--insert into users (first_name, last_name, email) values ('Flossy', 'Pycnonotus barbatus', 'fheinssen1@taobao.com');
--insert into users (first_name, last_name, email) values ('Thoma', 'Leptoptilos crumeniferus', 'ttupp2@themeforest.net');
--insert into users (first_name, last_name, email) values ('Steward', 'Amblyrhynchus cristatus', 'sruthen3@dyndns.org');
--insert into users (first_name, last_name, email) values ('Bamby', 'Hystrix cristata', 'bgrisdale4@pagesperso-orange.fr');
--insert into users (first_name, last_name, email) values ('Gabriellia', 'Pseudalopex gymnocercus', 'gbolan5@is.gd');
--insert into users (first_name, last_name, email) values ('Merrick', 'Sitta canadensis', 'mbenham6@fotki.com');
--insert into users (first_name, last_name, email) values ('Kaleena', 'Toxostoma curvirostre', 'kmyderscough7@1und1.de');
--insert into users (first_name, last_name, email) values ('Antons', 'Boa caninus', 'abasinigazzi8@aol.com');
--insert into users (first_name, last_name, email) values ('Karoly', 'Merops nubicus', 'kmeiklam9@oaic.gov.au');

--update users set first_name = 'Johnny' where id = 2;
-- Without a where clause every records gets updated
--update users set first_name = 'Johnny';

--delete from users where id = 7;

select * from users;
select first_name, last_name from users;
select first_name, last_name from users where id = 10;

select CONCAT(first_name, ' ', last_name) as "Full name" from users;

select * from users
	where first_name > 'J';
--	order by last_name
--	limit 2 offset 1;