package com.JDBC.industry;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JDBC.industry.dao.StudentDao;
import com.JDBC.industry.entities.Student;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Test {

	public static void main(String[] args) {
		

		
	ApplicationContext  con= new ClassPathXmlApplicationContext("com/JDBC/industry/config.xml");
	      
	
	StudentDao dao = con.getBean("studentdao",StudentDao.class);
	
	
	         //Insert
		/*
		 * Student s = new Student();
		 * 
		 * s.setId(12); s.setCity("");
		 * 
		 * int result = dao.insert(s);
		 * 
		 * System.out.println("Added"+ result);
		 */
          
	
	            //Update
		/*
		 * Student s = new Student(); s.setId(89); s.setCity("Indore"); int result =
		 * dao.change(s);
		 * 
		 * System.out.println(result+"updated");
		 */
	
	
	         //Deleted
		/*
		 * int result = dao.delete(11);
		 * 
		 * System.out.println("deleted"+result);
		 */
	
	
	       //select single object
	   
		/*
		 * Student student = dao.getStudent(89); System.out.println(student);
		 */
	     
	
	       //Single all data
	     List<Student> students = dao.getAllStudents();
	     for(Student s : students) {
	    	 System.out.println(s);
	     }
	}

}
