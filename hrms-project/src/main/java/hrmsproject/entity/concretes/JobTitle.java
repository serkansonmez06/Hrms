package hrmsproject.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle {
	
	
	@GeneratedValue
	@Column(name="id")
	@Id
	private int id;
	
	@Column(name="title")
	private String title;
	
	public JobTitle() {
		
	}

	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	

}