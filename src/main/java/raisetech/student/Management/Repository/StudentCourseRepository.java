package raisetech.student.Management.Repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.Management.data.Student_Course;

@Mapper
public interface StudentCourseRepository {


  @Select("SELECT * FROM students_courses")
  List<Student_Course> search();

  List<Student_Course> searchStudent_Course();
}


