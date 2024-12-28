create database school;
use school;

create table student (
    student_id int primary key,
    student_name varchar(100),
    student_place varchar(100),
    course varchar(100),
    contact_num varchar(15)
);
