package hrmsproject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.business.abstracts.JobTitleService;
import hrmsproject.dataAccess.abstracts.JobTItleDao;
import hrmsproject.entity.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService {

	private JobTItleDao JobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTItleDao JobTitleDao)	{
		super();
		this.JobTitleDao = JobTitleDao;
	}
	
	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.JobTitleDao.findAll();
	}

}
