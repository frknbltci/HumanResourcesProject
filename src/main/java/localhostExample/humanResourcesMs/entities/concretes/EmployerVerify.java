package localhostExample.humanResourcesMs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="EmployersVerify")
public class EmployerVerify {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="EmailVerify")
	private boolean emailVerify;
	
	@Column(name="StafVerify")
	private boolean stafVerify;
	
	@Column(name="EmployerId")
	private int employerId;
	
	public EmployerVerify() {
		
	}
	
	public EmployerVerify(int id,boolean emailVerify,boolean stafVerify,int employerId) {
		super();
		this.emailVerify=emailVerify;
		this.id=id;
		this.stafVerify=stafVerify;
		this.employerId=employerId;
		
	}
	
	
}
