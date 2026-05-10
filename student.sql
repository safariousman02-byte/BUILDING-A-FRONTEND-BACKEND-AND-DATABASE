CREATE DATABASE student_db;



CREATE TABLE students (

	id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	course VARCHAR(100) NOT NULL,
	grade INTERGER CHECK (grade >= 0 AND grade <= 100)

);

INSERT INTO students (name, course, grade) VALUES
('John Doe', 'Computer Science', 85);
('Jane Smith', 'MATHS', 50);
('Alice Brown', 'PHYSICS', 70);

