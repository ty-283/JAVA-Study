package raisetech.student.Management.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.student.Management.Controller.converter.StudentConverter;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.StudentsCourses;
import raisetech.student.Management.domain.StudentDetail;
import raisetech.student.Management.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;
  private StudentConverter converter;

  @Autowired
  public StudentController(StudentService service, StudentConverter converter) {

    this.service = service;
    this.converter = converter;
  }

  @GetMapping("/studentList")
  public List<StudentDetail> getStudentList() {
    List<Student> students = service.searchStudentList();
    List<StudentsCourses> studentsCourses = service.searchStudent_CourseList();

    return converter.convertStudentDetails(students, studentsCourses);
  }


  @GetMapping("/studentCourseList")
  public List<StudentsCourses> getstudenCourseList() {
    return service.searchStudent_CourseList();
  }
}

