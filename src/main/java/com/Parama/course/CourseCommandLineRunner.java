package com.Parama.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Parama.course.SpringDataJpa.CourseSpringDataJpaRepository;
import com.Parama.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	/*@Autowired
	//private CourseJdbcRepository repository;
	//@Override
	//public void run(String... args) throws Exception {
		
		//repository.insert(new Course(1,"Agriculture","Sugripan"));
		repository.insert(new Course(2,"Enterpreneur","Pary"));
		repository.deleteByid(2);
		System.out.println(repository.findByid(1));
		}*/
	/*@Autowired
    private CourseJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Agriculture","Sugripan"));
		repository.insert(new Course(2,"Enterpreneur","Pary"));
		repository.deleteByid(2);
		System.out.println(repository.findByid(1));
	}*/
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Agriculture","Sugripan"));
		repository.save(new Course(2,"Enterpreneur","Pary"));
		repository.save(new Course(3,"Economy","Jana"));
		repository.save(new Course(3,"Maths","Ashok"));
		System.out.println(repository.findAll());
		repository.deleteById(2l);//this deleteById is an inbuilt method used by springdatajpa
		System.out.println(repository.count());
		System.out.println(repository.findById(1l));//this findById is an inbuilt method used by springdatajpa
		System.out.println(repository.findByAuthor("Jana"));
		System.out.println(repository.findByName("Maths"));
}
}
