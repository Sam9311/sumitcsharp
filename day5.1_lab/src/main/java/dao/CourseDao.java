package dao;

import java.util.List;

import pojos.Course;

public interface CourseDao {
	//display courses
	 List<Course> displayCourses();
	 
	 //insert course
	 String insertCourse(Course course);
	 
	 //display one
	 Course dispCourse(Long id);

}
