package raisetech.student.Management.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import raisetech.student.Management.data.Student;
import raisetech.student.Management.data.StudentsCourses;

@Getter
@Setter
public class StudentDetail {

  private Student student;
  private List<StudentsCourses> studentsCourses;

}
