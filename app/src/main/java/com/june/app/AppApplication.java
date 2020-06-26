package com.june.app;

import com.june.app.domain.Course;
import com.june.app.domain.Student;
import com.june.app.repository.CourseRepository;
import com.june.app.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	private StudentRepository studentRepository;
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(StudentRepository studentRepository, CourseRepository courseRepository) {
		return (args) -> {
			Student student = new Student();
			student.setName("John Doe");
			studentRepository.save(student);

			Course course = new Course();
			course.setName("Math");
			course.setStudent(student);
			Course saved1 = courseRepository.save(course);
			Course course1 = new Course();
			course1.setName("CS");
			course1.setStudent(student);
			Course saved2 = courseRepository.save(course1);
		};
	}
}
