package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cs.model.Student;
import cs.repo.Studentrepo;

public class SpringMainJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext a = new AnnotationConfigApplicationContext(Studentrepo.class);
		Student s = (Student) a.getBean("s");
		s.display();

	}

}
