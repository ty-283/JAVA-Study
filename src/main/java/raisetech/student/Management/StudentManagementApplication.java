package raisetech.student.Management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

  @Autowired
  private StudentCourseRepository repository;


  public static void main(String[] args) {
    SpringApplication.run(StudentManagementApplication.class, args);
  }

  @GetMapping("/studentCourseList")
  public List<Student_Course> getstudenCourseList(){
  List<Student_Course> list = repository.search(  );

    System.out.println("--- 取得データ一覧 ---");
    list.forEach(course -> {
      System.out.println("ID: " + course.getId() + ", コース名: " + course.getCourse_name());
    });

    return list;
  }

}
