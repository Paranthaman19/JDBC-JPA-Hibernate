package com.Parama.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Parama.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
    private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Agriculture","Sugripan"));
		repository.insert(new Course(2,"Enterpreneur","Pary"));
		repository.delete(2);
	}
          
}
