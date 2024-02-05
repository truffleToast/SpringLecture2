package course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import net.sf.jsqlparser.statement.insert.Insert;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now!", "in28minutes"));
		repository.insert(new Course(1, "Learn Azure Now!", "in28minutes"));
		repository.insert(new Course(1, "Learn DevOps Now!", "in28minutes"));
		repository.deleteById(1); // 아이디가 1인 값을 지우기
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
