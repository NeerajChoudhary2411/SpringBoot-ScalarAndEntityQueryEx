package in.neeraj.org;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.neeraj.org.model.ResourceDtls;
import in.neeraj.org.repository.ResourceRepository;
import in.neeraj.org.repository.ResourceRepository.FetchResult1;
import in.neeraj.org.repository.ResourceRepository.Result;

@SpringBootApplication
public class SpringBootScalarAndEntityQueryExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootScalarAndEntityQueryExApplication.class, args);
		
		ResourceRepository repo=context.getBean(ResourceRepository.class);
		
		//inserting records
//		List<ResourceDtls> list = repo.saveAll(
//				List.of(new ResourceDtls(1001, "Neeraj", "DEV", "2 Years"),
//				new ResourceDtls(1002, "Sunil", "DEV", "3 Years"),
//				new ResourceDtls(1003, "Kunal", "QA", "2.5 Years"),
//				new ResourceDtls(1004, "Vivek", "DBA", "3 Years")
//				)
//		
//				);
//		if(list!=null)
//		System.out.println("Resources Saved.");
//		else 
//			System.out.println("Not Saved");
		
		//FETCHING RECORDS USING PROJECTION CONCEPT
		
		List<FetchResult1> list = repo.findByResourceSkill("DEV",FetchResult1.class);
		for(FetchResult1 r1:list) {
			System.out.println(r1.getResourceName()+" "+r1.getResourceExp());
		}
		
		context.close();
	}

}
