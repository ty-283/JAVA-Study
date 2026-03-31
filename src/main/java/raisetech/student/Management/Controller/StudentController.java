package raisetech.student.Management.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import raisetech.student.Management.Controller.converter.StudentConverter;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.StudentsCourses;
import raisetech.student.Management.domain.StudentDetail;
import raisetech.student.Management.service.StudentService;

@Controller
public class StudentController {

  private StudentService service;
  private StudentConverter converter;

  @Autowired
  public StudentController(StudentService service, StudentConverter converter) {

    this.service = service;
    this.converter = converter;
  }

  @GetMapping("/studentList")
  public String getStudentList(Model model) {
    List<Student> students = service.searchStudentList();
    List<StudentsCourses> studentsCourses = service.searchStudent_CourseList();

    model.addAttribute("studentList", converter.convertStudentDetails(students, studentsCourses));
    return "studentList";
  }


  @GetMapping("/studentCourseList")
  public List<StudentsCourses> getstudenCourseList() {
    return service.searchStudent_CourseList();
  }
}

