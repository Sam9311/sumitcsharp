package tester;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;

import dao.StudentDao;
import dao.StudentDaoImpl;
import pojos.Student;

public class TestInsertStudent {
	public static void main(String args[]) {
		
		try(SessionFactory sf=getFactory()){
		System.out.println("inserting");
		StudentDao std=new StudentDaoImpl();
		//System.out.println(std.dispStudent());
		std.insertStudent(new Student("sghgfggft", "mgihgdfdg", "samoogssb"));
	
		System.out.println("inserted");
		}
		
		
	}

}
