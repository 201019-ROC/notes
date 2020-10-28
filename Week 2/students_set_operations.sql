create schema gradebook;

show search_path;
set search_path to gradebook;

create table students (
	student_id SERIAL primary key,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	grade INT
);


INSERT INTO students (first_name, last_name, grade) VALUES ('Rubetta', 'Arnault', 71);
INSERT INTO students (first_name, last_name, grade) VALUES ('Pavlov', 'Gedney', 77);
INSERT INTO students (first_name, last_name, grade) VALUES ('Pauline', 'Cruess', 61);
INSERT INTO students (first_name, last_name, grade) VALUES ('Gustav', 'Lambeth', 81);
INSERT INTO students (first_name, last_name, grade) VALUES ('Garey', 'Goulding', 96);
INSERT INTO students (first_name, last_name, grade) VALUES ('Sidonnie', 'Lofthouse', 63);
INSERT INTO students (first_name, last_name, grade) VALUES ('Vicki', 'Mardling', 87);
INSERT INTO students (first_name, last_name, grade) VALUES ('Michal', 'Londsdale', 61);
INSERT INTO students (first_name, last_name, grade) VALUES ('Hephzibah', 'Gealy', 76);
INSERT INTO students (first_name, last_name, grade) VALUES ('Cherrita', 'Theuff', 66);
INSERT INTO students (first_name, last_name, grade) VALUES ('Shandee', 'Dell Casa', 83);
INSERT INTO students (first_name, last_name, grade) VALUES ('Pedro', 'Collister', 95);
INSERT INTO students (first_name, last_name, grade) VALUES ('Adam', 'Petkovic', 68);
INSERT INTO students (first_name, last_name, grade) VALUES ('Margaux', 'Drinkale', 95);
INSERT INTO students (first_name, last_name, grade) VALUES ('Helene', 'Disbrow', 67);
INSERT INTO students (first_name, last_name, grade) VALUES ('Sigismundo', 'Gomery', 93);
INSERT INTO students (first_name, last_name, grade) VALUES ('Tobi', 'Loukes', 79);
INSERT INTO students (first_name, last_name, grade) VALUES ('Lemar', 'Warburton', 78);
INSERT INTO students (first_name, last_name, grade) VALUES ('Dorree', 'Sweedy', 98);
INSERT INTO students (first_name, last_name, grade) VALUES ('Duke', 'Kendrew', 75);

select avg(grade) from students;
select upper(first_name),upper(last_name) from students where student_id = 2; 

select * from students where grade = (select min(grade) from students);

select grade, count(grade) from students group by grade having grade > 80 order by grade desc;

select last_name, first_name from students order by last_name, first_name;

INSERT INTO students (first_name, last_name, grade) VALUES ('Aubetta', 'Arnault', 71);
INSERT INTO students (first_name, last_name, grade) VALUES ('Bubetta', 'Arnault', 71);
INSERT INTO students (first_name, last_name, grade) VALUES ('Cubetta', 'Arnault', 71);

-- Union, combines results from 2 queries, checks for duplicates
select * from students where length(first_name) < 5
union
select * from students where grade > 80;

-- Union all, combines results from 2 queries, no duplicate check
select * from students where length(first_name) > 5
union all
select * from students where grade > 80;

-- Intersect, return common records
select * from students where length(first_name) > 5
intersect 
select * from students where grade > 80;

-- Except
select * from students where length(first_name) > 5
except 
select * from students where grade > 80;