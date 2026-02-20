package raisetech.student.Management.Repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.Management.data.StudentsCourses;

@Mapper
public interface StudentCourseRepository {


  @Select("SELECT * FROM students_courses")
  List<StudentsCourses> search();

  List<StudentsCourses> searchStudent_Course();
}


