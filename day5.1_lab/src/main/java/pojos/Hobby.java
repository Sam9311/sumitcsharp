package pojos;

import javax.persistence.*;

@Embeddable//this is the collection that will reside in the student table
public class Hobby{
	
	
	
	@Column(name="hobbies",length=30)
	private String hobbyname;
	
	public Hobby() {
		super();
	}

	public Hobby(String hobby) {
		super();
		this.hobbyname = hobby;
	}
	
	

	public String getHobby() {
		return hobbyname;
	}

	public void setHobby(String hobby) {
		this.hobbyname = hobby;
	}

	

}
