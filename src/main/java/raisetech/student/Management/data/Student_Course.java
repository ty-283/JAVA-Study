package raisetech.student.Management.data;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student_Course {
  private String id;
  private String student_id;
  private String course_name;
  private Date start_data;
  private Date end_planned_data;

}
