package pojos;

import javax.persistence.*;



@MappedSuperclass
public class BaseEntity {
	
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long Id;
	
	public BaseEntity() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
	

}
