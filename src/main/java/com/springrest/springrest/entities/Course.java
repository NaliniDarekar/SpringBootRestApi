package com.springrest.springrest.entities;

public class Course {

	private long Id;
	private String title;
	private String discription;
	public Course(long id, String title, String discription) {
		super();
		this.Id = id;
		this.title = title;
		this.discription = discription;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", title=" + title + ", discription=" + discription + "]";
	}
	
	
	
}
