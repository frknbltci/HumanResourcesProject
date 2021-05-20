package localhostExample.humanResourcesMs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import localhostExample.humanResourcesMs.business.abstracts.EmployerService;
import localhostExample.humanResourcesMs.dataAccess.abstracts.EmployerDao;
import localhostExample.humanResourcesMs.entities.concretes.Employer;

//Bu class service görevi görecek businnes olduğunu tanıtıyoruz.
@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao; 
	
	//Dependency Inj. arka tarafta fabrika tasarım desenini çalıştırır
	// Autowired : Servicede oluşan instance ile bizim manager'ımızı eşleştirmeye yarıyor.
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	@Override
	public List<Employer> getAll() {
		
		return employerDao.findAll();
	}

}
