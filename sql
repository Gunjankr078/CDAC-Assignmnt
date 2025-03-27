use school;
create table student(rollNo INTEGER PRIMARY KEY, name VARCHAR(50), city Varchar(20) , marks Integer , courseid Integer  );

create table teacher(id INTEGER PRIMARY KEY, name VARCHAR(50), city Varchar(20)  , courseid Integer );

create table course (courseid Integer Primary Key , coursename varchar(100));

alter table student RENAME COLUMN course TO courseid;


alter table student add constraint fk_courseid foreign key (courseid) references course(courseid);

alter table teacher add constraint t_courseid foreign key (courseid) references  course(courseid);

ALTER TABLE student  ADD gender VARCHAR(1) CHECK (gender IN ('m', 'f', 'o'));

INSERT INTO course (courseid, coursename) VALUES
(101, 'Mathematics'),
(102, 'Physics'),
(103, 'Chemistry'),
(104, 'Biology'),
(105, 'Computer Science');



INSERT INTO student (rollNo, name, city, marks, courseid, gender) VALUES
(1, 'Ananya Sharma', 'Bengaluru', 85, 101, 'f'),
(2, 'Rohan Gupta', 'Mumbai', 92, 102, 'm'),
(3, 'Simran Kaur', 'Delhi', 88, 103, 'f'),
(4, 'Aarav Patel', 'Ahmedabad', 76, 104, 'm'),
(5, 'Meera Iyer', 'Chennai', 89, 105, 'f'),
(6, 'Rahul Roy', 'Kolkata', 67, 102, 'm'),
(7, 'Sneha Nair', 'Hyderabad', 91, 101, 'f'),
(8, 'Ishaan Kapoor', 'Pune', 72, 103, 'm'),
(9, 'Sanya Jain', 'Jaipur', 84, 101, 'f'),
(10, 'Aditya Malhotra', 'Lucknow', 78, 104, 'm'),
(11, 'Priya Das', 'Patna', 80, 105, 'f'),
(12, 'Kunal Bhatt', 'Surat', 90, 102, 'm'),
(13, 'Ria Sen', 'Bhopal', 86, 103, 'f'),
(14, 'Arjun Khanna', 'Amritsar', 75, 104, 'm'),
(15, 'Tanya Choudhury', 'Nagpur', 88, 101, 'f'),
(16, 'Mohit Verma', 'Indore', 82, 102, 'm'),
(17, 'Aditi Rao', 'Mysore', 79, 105, 'f'),
(18, 'Vikram Singh', 'Guwahati', 92, 103, 'm'),
(19, 'Neha Mehta', 'Kanpur', 87, 104, 'f'),
(20, 'Akash Kulkarni', 'Thiruvananthapuram', 74, 101, 'm');


INSERT INTO teacher (id, name, city, courseid) VALUES
(1, 'Dr. Kavita Sharma', 'Delhi', 101),
(2, 'Mr. Rajesh Gupta', 'Mumbai', 102),
(3, 'Ms. Anjali Verma', 'Chennai', 103),
(4, 'Dr. Arvind Kumar', 'Bengaluru', 104),
(5, 'Prof. Priya Menon', 'Hyderabad', 105);




SELECT 
    teacher.name AS TeacherName, 
    student.name AS StudentName, 
    course.coursename AS CourseName
FROM 
    student
JOIN 
    teacher ON student.courseid = teacher.courseid
JOIN 
    course ON student.courseid = course.courseid
WHERE 
    teacher.courseid = 104;



SELECT student.name, student.city 
FROM student 
WHERE student.courseid IN (
    SELECT teacher.courseid 
    FROM teacher 
    WHERE teacher.courseid = 104
);

