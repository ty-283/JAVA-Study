package raisetech.student.Management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.Management.Repository.StudentRepository;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.StudentsCourses;

@Service
public class StudentService {

  private final StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    List<Student> Students = repository.search();

    return new ArrayList<>(Students);
  }
  //絞り込みをする。年齢が３０代の人のみを抽出する。
  //抽出したリストをコントローラーに返す。

  public List<StudentsCourses> searchStudent_CourseList() {
    //絞り込み検索で「Javaコース」のコース情報のみを抽出する。
    //抽出したリストをコントローラーに返す。
    List<StudentsCourses> studentCourseList = repository.searchStudent_Course();
    return studentCourseList.stream()
        .filter(studentCourse -> studentCourse.getCourse_name().contains("JAVAコース"))
        .collect(Collectors.toList());
  }

}
