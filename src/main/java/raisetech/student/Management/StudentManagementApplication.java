package raisetech.student.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello,World!";
	}
}
