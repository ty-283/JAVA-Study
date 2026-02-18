package raisetech.student.Management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.student.Management.Repository.StudentCourseRepository;
import raisetech.student.Management.Repository.StudentRepository;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.Student_Course;

@SpringBootApplication
@RestController
public class StudentManagementApplication {


  public static void main(String[] args) {
    SpringApplication.run(StudentManagementApplication.class, args);
  }

}



