package localhostExample.humanResourcesMs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import localhostExample.humanResourcesMs.entities.concretes.EmployerVerify;

public interface EmployerVerifyDao extends JpaRepository<EmployerVerify, Integer>{

	
}
