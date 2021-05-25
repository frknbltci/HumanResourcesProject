package localhostExample.humanResourcesMs.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="JobSeekers")
@AllArgsConstructor
@NoArgsConstructor

public class JobSeeker {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="UserId")
	private int userId;
	
	@Column(name="TcIdentityNumber")
	private String tcIdentityNumber;
	
	@Column(name="JobPositionId")
	private int jobPositionId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="CreatedDate")
	private Date createdDate;
	
	@Column(name="BirthDate")
	private Date birthdate;
}
