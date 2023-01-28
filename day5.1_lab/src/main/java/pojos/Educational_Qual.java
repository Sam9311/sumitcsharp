package pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Educational_Qual {
	@Column(length = 50)
	private String type;
	private int year;
	private int marks;
	
	
	
	
	public Educational_Qual() {
		super();
	}
	public Educational_Qual(String type, int year, int marks) {
		super();
		this.type = type;
		this.year = year;
		this.marks = marks;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
