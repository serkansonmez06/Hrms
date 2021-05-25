package hrmsproject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.business.abstracts.JobTitleService;
import hrmsproject.core.utilities.results.DataResult;
import hrmsproject.core.utilities.results.Result;
import hrmsproject.core.utilities.results.SuccessDataResult;
import hrmsproject.core.utilities.results.SuccessResult;
import hrmsproject.dataAccess.abstracts.JobTItleDao;
import hrmsproject.entity.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService {

	private JobTItleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTItleDao jobTitleDao)	{
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		  
		return new SuccessDataResult<List<JobTitle>>
		(this.jobTitleDao.findAll(),"Data has been listed");
				
				
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job title has been added");
	}

}
