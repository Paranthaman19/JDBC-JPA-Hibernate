package com.Parama.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Parama.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	//@Autowired
    //private CourseJdbcRepository repository;
	@Autowired
    private CourseJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Agriculture","Sugripan"));
		repository.insert(new Course(2,"Enterpreneur","Pary"));
		repository.deleteByid(2);
		System.out.println(repository.findByid(1));
	}
          
}
