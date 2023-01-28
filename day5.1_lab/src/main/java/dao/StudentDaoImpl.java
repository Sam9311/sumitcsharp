package dao;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.AadharCard;
import pojos.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> displayStudents() {
		List<Student> stdlist=null;
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
		return stdlist;
	}

	@Override
	public String insertStudent(Student student) {
		String msg="failed insertion!!!!!!";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
	try {	
	//category instance 
		//eager, .size(), join fetch
		session.persist(student);
		tx.commit();
		msg="inserted successfully...";
	}
	catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
	return msg;
		
	}

	@Override
	public Student dispStudent() {
String msg="failed insertion!!!!!!";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		Student std=null;
	try {	
	//category instance 
		//eager, .size(), join fetch
	
		std=session.load(Student.class,11l);
		std.getEmail();
		tx.commit();
		msg="displaying successfully...";
	}
	catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
	return std;
	}

	@Override
	public String aadharDetails(int id,String AdharNo,String Location,String date) {
	String msg="failed insertion!!!!!!";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
	try {	
	//category instance 
		//eager, .size(), join fetch
		Student std=session.get(Student.class,id);
		std.setAadharcard(new AadharCard(AdharNo, Location, LocalDate.parse(date)));
		session.persist(std);
		tx.commit();
		msg="inserted successfully...";
	}
	catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
	return msg;
		
	}

}
