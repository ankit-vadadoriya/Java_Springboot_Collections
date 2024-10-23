package com.ankit.spring_data_jpa;

import com.ankit.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Ankit");
		s1.setMarks(80);
		repo.save(s1);         // for use create and update
//		repo.delete(s1);      //for use delete

		s2.setRollNo(102);
		s2.setName("Jay");
		s2.setMarks(90);
		repo.save(s2);

//		s3.setRollNo(103);
//		s3.setName("Parth");
//		s3.setMarks(77);
//		repo.save(s3);


		System.out.println("findById" + repo.findById(102));

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Ankit"));
//		System.out.println(repo.findByMarks(77));
//		System.out.println(repo.findByMarksGreaterThan(79));
//		System.out.println(repo.findAll());

	}
}
