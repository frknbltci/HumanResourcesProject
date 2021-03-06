package localhostExample.humanResourcesMs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="UserId")
	private int userId;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSite")
	private String webSite;
	
	@Column(name="Phone")
	private String phone;
	
}
