CREATE TABLE student_detail(
    id INT AUTO_INCREMENT PRIMARY KEY,
    stud_id INT NOT NULL UNIQUE,
    first_name VARCHAR(10) NOT NULL,
    last_name VARCHAR(10),
    email VARCHAR(255) NOT NULL UNIQUE,
    phn_num VARCHAR(10),
    gender VARCHAR(10)
);

CREATE TABLE course_detail(
    id INT AUTO_INCREMENT PRIMARY KEY,
    course_type VARCHAR(20) NOT NULL,
    course_name VARCHAR(20) NOT NULL,
    isActive BOOLEAN NOT NULL
);
