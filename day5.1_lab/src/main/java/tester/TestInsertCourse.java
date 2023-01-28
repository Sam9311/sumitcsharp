package tester;

import static utils.HibernateUtils.getFactory;
import static java.time.LocalDate.parse;
import org.hibernate.SessionFactory;

import dao.CourseDao;
import dao.CourseDaoImpl;
import pojos.Course;
import pojos.Student;

public class TestInsertCourse {
	public static void main(String args[]) {
		
		try(SessionFactory sf=getFactory()){
		System.out.println("inserting");
	CourseDao std=new CourseDaoImpl();
		//System.out.println(std.dispStudent());
		std.insertCourse(new Course("AdvanceJava", parse("2022-12-12"), parse("2022-12-24"), 1800, 230));
		
		//std.insertStudent(new Student("sghgfghfdgft", "mlhhgihgdfdg", "samgdfgooghssb"));
		System.out.println("inserted");
		}
		
		
	}

}
