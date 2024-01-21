package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.dto.Student;

public class StudentDao {

	private HibernateTemplate template;
	
	//insert data
	@Transactional
	public void saveStudent(Student student) {
		int i = (Integer) template.save(student);
		System.out.println(i +"added sucessfully!");
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	
}
