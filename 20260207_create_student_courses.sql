mysql> DESC students;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| id       | varchar(255) | NO   | PRI | NULL    |       |
| fullname | varchar(50)  | YES  |     | NULL    |       |
| furigana | varchar(50)  | YES  |     | NULL    |       |
| email    | varchar(100) | YES  |     | NULL    |       |
| area     | varchar(150) | YES  |     | NULL    |       |
| age      | int          | YES  |     | NULL    |       |
| sex      | varchar(20)  | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

mysql> DESC students_courses;
+------------------+--------------+------+-----+---------+-------+
| Field            | Type         | Null | Key | Default | Extra |
+------------------+--------------+------+-----+---------+-------+
| id               | varchar(255) | NO   | PRI | NULL    |       |
| student_id       | varchar(255) | YES  |     | NULL    |       |
| course_name      | varchar(255) | YES  |     | NULL    |       |
| start_data       | date         | YES  |     | NULL    |       |
| end_planned_data | date         | YES  |     | NULL    |       |
+------------------+--------------+------+-----+---------+-------+