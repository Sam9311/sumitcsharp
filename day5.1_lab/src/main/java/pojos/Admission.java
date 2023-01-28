package pojos;

import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="admission_tbl",uniqueConstraints = @UniqueConstraint(columnNames = {"admit_stdid","admit_courseid"}))
public class Admission extends BaseEntity {


	@ManyToOne
	@JoinColumn(name="admit_stdid")
	private Student admittedStudent;
	
	@ManyToOne
	@JoinColumn(name="admit_courseid")
	private Course admittedCourse;
	
	@CreationTimestamp
	@Column(name="admit_date")
	private LocalDate admissionDate;
	@Column(name="result_date")
	private LocalDate resultDate;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Status status;
	
	
	public Admission() {
		super();
	}
	public Student getAdmittedStudent() {
		return admittedStudent;
	}
	public void setAdmittedStudent(Student admittedStudent) {
		this.admittedStudent = admittedStudent;
	}
	public Course getAdmittedCourse() {
		return admittedCourse;
	}
	public void setAdmittedCourse(Course admittedCourse) {
		this.admittedCourse = admittedCourse;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	@Override
	public String toString() {
		return "Admission [admittedStudentID=" + super.getId()+"admittedStudent=" + admittedStudent + ", admittedCourse=" + admittedCourse+", admissionDate=" + admissionDate + ", resultDate=" + resultDate + ", status=" + status + "]";
	}

}
