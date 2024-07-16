package com.Parama.course.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Parama.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}
