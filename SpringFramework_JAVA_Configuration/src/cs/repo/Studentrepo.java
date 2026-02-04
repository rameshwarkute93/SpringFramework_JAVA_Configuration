package cs.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cs.model.Student;

@Configuration
public class Studentrepo {
	@Bean
	public Student s() {
		Student s = new Student();
		s.setId(2);
		s.setName("Ganesh");
		s.setCity("Pune");
		return s;
		
	}
}
