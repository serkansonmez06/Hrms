package hrmsproject.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.business.abstracts.JobTitleService;
import hrmsproject.entity.concretes.JobTitle;



@RestController
@RequestMapping("hrms/jobtitles")
public class JobTitleControllers {

	
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
	}
}
