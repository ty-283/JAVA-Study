package raisetech.student.Management.Repository;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.Student_Course;

/**
 * 受講生情報を扱うリポジトリ。
 *
 * 全件検索や単一条件での検索が行えるクラスです。
 */
@Mapper
public interface StudentRepository {

  /**
   * 全件検索します。
   *
   * @return 全件検索した受講生情報の一覧
   */

  @Select("SELECT * FROM students")
  List<Student> search();


  @Select("SELECT * FROM students_courses")
  List<Student_Course> searchStudent_Course();

}


