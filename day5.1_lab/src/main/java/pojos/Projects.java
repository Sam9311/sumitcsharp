package pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="projects")
public class Projects extends BaseEntity {
@Column(name="project_title", length=30)
	private String projectTitle;
	private LocalDate completionDate;
	
	@ManyToMany(mappedBy="projects")
	private Set<Student> studentsPro=new HashSet<Student>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completionDate == null) ? 0 : completionDate.hashCode());
		result = prime * result + ((projectTitle == null) ? 0 : projectTitle.hashCode());
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
		Projects other = (Projects) obj;
		if (completionDate == null) {
			if (other.completionDate != null)
				return false;
		} else if (!completionDate.equals(other.completionDate))
			return false;
		if (projectTitle == null) {
			if (other.projectTitle != null)
				return false;
		} else if (!projectTitle.equals(other.projectTitle))
			return false;
		return true;
	}

	public Set<Student> getStudentsPro() {
		return studentsPro;
	}

	public void setStudentsPro(Set<Student> studentsPro) {
		this.studentsPro = studentsPro;
	}

	@Override
	public String toString() {
		return "Projects [Id="+super.getId()+"projectTitle=" + projectTitle + ", completionDate=" + completionDate + ", projectStudent="
				 + "]";
	}
	
	
}
