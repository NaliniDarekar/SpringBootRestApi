package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getcourse(Long courseId);
	public Course addCourse(Course course);

	public Course updatecourse(Course course);

	public List<Course> deleteCourse(Course course);

	
}
