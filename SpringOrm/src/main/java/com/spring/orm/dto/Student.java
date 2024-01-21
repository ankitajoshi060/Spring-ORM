package com.spring.orm.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String studentAddress, String course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", course=" + course + "]";
	}
	
	
	
}
