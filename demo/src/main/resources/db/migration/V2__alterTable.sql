CREATE TABLE student_course_detail(
    course_id INT NOT NULL,
    student_id INT NOT NULL
);

ALTER TABLE student_course_detail
ADD CONSTRAINT fk_student_detail
FOREIGN KEY (student_id)
REFERENCES student_detail (id);

ALTER TABLE student_course_detail
ADD CONSTRAINT fk_course_detail
FOREIGN KEY (course_id)
REFERENCES course_detail (id);