package localhostExample.humanResourcesMs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import localhostExample.humanResourcesMs.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	
}
