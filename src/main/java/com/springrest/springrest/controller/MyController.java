package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
 private CourseService courseservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome";
	}
	
	// get the courses
	
	
	 @GetMapping("/courses") 
	 public List<Course> getcourse()
	 
	  {
		 System.out.println("hi");
		 return this.courseservice.getCourses();
		 }
	 
	@GetMapping("/courses{courseId}")
	public Course getcourseId(@PathVariable String courseId)
	{
		System.out.println(courseId);
	return this.courseservice.getcourse(Long.parseLong(courseId));
	}

	
	
	@PostMapping("/courses")
	public Course addcourses( @RequestBody  Course course)
	{
		System.out.println(course.getId());
		return this.courseservice.addCourse(course);
		
	}
	
	@PutMapping("/courses")
	public Course updtecourse(@RequestBody Course course)
	{
		System.out.println(course.getId());
		return this.courseservice.updatecourse(course);
	}
	
	@DeleteMapping("/courses")
	public List<Course> deletecourse(@RequestBody Course course)
	{
		System.out.println(course.getId());
		return this.courseservice.deleteCourse(course);
	}
}
