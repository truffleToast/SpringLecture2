package com.in28minutes.springboot.learnjpaandhibernate.course;

public class Course {
	private long id;
	private String name;
	private String author;
	
	// 기본 생성자
	public Course() {
		
	}

	// 생성자
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
	//생성자
	//getter & setter
}
