package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl  implements CourseService{

	
	List<Course> list;
	 public CourseServiceImpl()
	 {
		 list=new ArrayList<>();
		 list.add(new Course(4343 , "Java Core Course" , "This course contains basics of java"));
		 list.add(new Course(355 , "Spring boot course" , "Creating rest api using spring boot "));
		 
		 list.add(new Course(505 , "Scalar course" , " This is Scalar Course "));

	 }
	
	
	@Override
	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getcourse(Long courseId) {
Course c=null;
				for(Course course:list )
				{
					if(course.getId()==courseId)
					{
						c=course;
						break;
					}
				}
				
				return c;

	}
     @Override
	public Course addCourse(Course course) {
        list.add(course);
		return course;
	}


	@Override
	public Course updatecourse(Course course) {
for(int i=0; i<list.size();i++)
{
	if(list.get(i).getId()==course.getId())
	{
	list.get(i).setTitle(course.getTitle());	
	list.get(i).setDiscription(course.getDiscription());	
	}
}
		return course;
	}


	@Override
	public List<Course> deleteCourse(Course course) {
		for(int i=0 ; i<list.size();i++)
		{
	if(list.get(i).getId()==course.getId())
		list.remove(i);
		}

		return list;
	}

	
}


	

	



