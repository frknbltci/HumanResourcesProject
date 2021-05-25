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

@Data
@Entity
@Table(name="JobSeekerVerify")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerVerify {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="EmailVerify")
	private boolean emailVerify; 
	
	@Column(name="JobSeekerId")
	private int jobseekerId;
}
