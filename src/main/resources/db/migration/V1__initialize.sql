SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS students;

CREATE TABLE students (
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;



DROP TABLE IF EXISTS courses;

CREATE TABLE courses (
    id INT(11) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;

DROP TABLE IF EXISTS students_courses;

CREATE TABLE students_courses (
    id INT(11) NOT NULL AUTO_INCREMENT,
    student_id INT NOT NULL,
    course_id INT NOT NULL,
    FOREIGN KEY(student_id) REFERENCES students(id),
    FOREIGN KEY(course_id) REFERENCES courses(id),
    PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;

INSERT INTO students (id, name) VALUES (1, "Kirill");
INSERT INTO students (id, name) VALUES (2, "Vadim");
INSERT INTO students (id, name) VALUES (3, "Egor");

INSERT INTO courses(id, title) VALUES (1, "Java");
INSERT INTO courses(id, title) VALUES (2, "Python");
INSERT INTO courses(id, title) VALUES (3, "C++");

INSERT INTO students_courses(id, student_id, course_id) VALUES (1, 1, 1);
INSERT INTO students_courses(id, student_id, course_id) VALUES (2, 1, 2);
INSERT INTO students_courses(id, student_id, course_id) VALUES (3, 1, 3);
INSERT INTO students_courses(id, student_id, course_id) VALUES (4, 2, 2);
INSERT INTO students_courses(id, student_id, course_id) VALUES (5, 2, 3);
INSERT INTO students_courses(id, student_id, course_id) VALUES (6, 3, 2);




