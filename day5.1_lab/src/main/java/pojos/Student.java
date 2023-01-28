package pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "student_tbl")
public class Student extends BaseEntity {

	@Column(name = "first_name", length = 30)
	private String firstName;

	@Column(name = "last_name", unique = true, length = 30)
	private String lastName;

	@Column(unique = true, length = 60)
	private String email;

	// student 1---->* admission
	@OneToMany(mappedBy = "admittedStudent", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Admission> admissions = new ArrayList<>();
	
	// student*< ------ >* project
	@ManyToMany
	@JoinTable(name = "project_student", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "std_id"))
	private Set<Projects> projects = new HashSet<>();

	// student1 ---> * hobbies but, it is a value type hence @CollectionTable is
	// used
	@Embedded
	private AadharCard aadharcard;// @Embedded can be added and cannot be, one and the same
	@Embedded
	private Educational_Qual qualification;
	
//collection types
	@ElementCollection
	@CollectionTable(name="hobbies_tbl",joinColumns = @JoinColumn(name="std_id"))
	private List<Hobby> hobbies=new ArrayList<>();

	


	
	public Student() {

	}

	public Student(String firstName, String lastName, String email) {

		super();
		System.out.println("inserted");
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + super.getId() + "+firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	public AadharCard getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(AadharCard aadharcard) {
		this.aadharcard = aadharcard;
	}

	public Educational_Qual getQualification() {
		return qualification;
	}

	public void setQualification(Educational_Qual qualification) {
		this.qualification = qualification;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
