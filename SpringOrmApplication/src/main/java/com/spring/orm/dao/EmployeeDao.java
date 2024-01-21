package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.dto.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void saveEmployee(Employee employee) {
		int i = (Integer)hibernateTemplate.save(employee);
		System.out.println(i+" added successfully");
	}
	@Transactional
	public void updateEmployee(Employee employee)
	{
		hibernateTemplate.update(employee);
		System.out.println("employee updated sucessfully");
	}
	
	public void findEmployee(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		System.out.println(employee);
	}
	
	public void findAllEmployee() {
		List<Employee> list = hibernateTemplate.loadAll(Employee.class);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	@Transactional
	public void deleteEmployee(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		if (employee!=null) {
			hibernateTemplate.delete(employee);
		}
		else {
			System.out.println("employee not found");
		}
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
