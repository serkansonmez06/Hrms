package hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.entity.concretes.JobTitle;

public interface JobTItleDao extends JpaRepository<JobTitle, Integer>{

	
	//JobTitle and Integer indicates table and id number in database
}
