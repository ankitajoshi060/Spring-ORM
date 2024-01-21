package com.spring.orm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dto.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	StudentDao dao = context.getBean("dao", StudentDao.class);
    	Student student = new Student(10,"mark","mumbai","java");
    	dao.saveStudent(student);
    	
    }
}
