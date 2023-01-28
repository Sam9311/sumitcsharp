package dao;

import java.util.List;

import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

import pojos.Course;
import pojos.Student;

public class CourseDaoImpl implements CourseDao {

	@Override
	public List<Course> displayCourses() {
		List<Course> courselist=null;
		Session session=getFactory().getCurrentSession();
			Transaction tx=session.beginTransaction();
		try {	
		//category instance 
			//eager, .size(), join fetch
			
			tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
		}
		return courselist;
	}

	@Override
	public String insertCourse(Course course) {
		String msg="failed insertion!!!!!!";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
	try {	
	session.persist(course);
		tx.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
	return msg;
		
	}

	@Override
	public Course dispCourse(Long id) {
String msg="failed insertion!!!!!!";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		Course std=null;
	try {	
	//category instance 
		//eager, .size(), join fetch
	
		std=session.load(Course.class,id);
		std.getCapacity();
		tx.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
	return std;
	}

}
