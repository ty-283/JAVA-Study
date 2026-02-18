package raisetech.student.Management.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.Student_Course;
import raisetech.student.Management.service.StudentService;

@RestController
public class StudentController {

 private StudentService service;

 @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList(){
    return service.searchStudentList();
  }


  @GetMapping("/studentCourseList")
  public List<Student_Course> getstudenCourseList() {
    return service.searchStudent_CourseList();
  }
}
