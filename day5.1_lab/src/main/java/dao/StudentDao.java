package dao;

import java.util.List;

import pojos.Student;

public interface StudentDao {
	//display students
List<Student> displayStudents();

//insert student details
String insertStudent(Student student);

//display a student
Student dispStudent();

//enter aadhar card details
String aadharDetails(int id,String AdharNo,String Location,String date);


}
