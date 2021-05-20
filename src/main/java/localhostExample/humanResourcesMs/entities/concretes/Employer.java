package localhostExample.humanResourcesMs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Employers")
public class Employer {

	@Id
	@Column(name="Id")
	@GeneratedValue
	private int id;
	
	@Column(name="UserId")
	private int userId;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSite")
	private String webSite;
	
	@Column(name="Phone")
	private String phone;
	public Employer() {
		
	}
	
	public Employer(int id,int userId,String companyName,String webSite) {
		super();
		this.userId=userId;
		this.id=id;
		this.companyName=companyName;
		this.webSite=webSite;
	}
}
