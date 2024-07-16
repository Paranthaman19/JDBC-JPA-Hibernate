package com.Parama.course.jpa;

import org.springframework.stereotype.Repository;

import com.Parama.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	@PersistenceContext
     public EntityManager entityManager;
     public void insert(Course course) {
    	 entityManager.merge(course);
     }
     public Course findByid(long id) {
    	 return entityManager.find( Course.class,id);
     }
     public void deleteByid(long id) {
    	 Course course=entityManager.find( Course.class,id);
    	 entityManager.remove(course);
    	 }
     
}
