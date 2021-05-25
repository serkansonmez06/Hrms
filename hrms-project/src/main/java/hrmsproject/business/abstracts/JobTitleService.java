package hrmsproject.business.abstracts;

import java.util.List;

import hrmsproject.core.utilities.results.DataResult;
import hrmsproject.core.utilities.results.Result;
import hrmsproject.entity.concretes.JobTitle;

public interface JobTitleService {
	
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
}
