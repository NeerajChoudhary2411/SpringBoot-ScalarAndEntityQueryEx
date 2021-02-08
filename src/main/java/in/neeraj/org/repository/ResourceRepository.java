package in.neeraj.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.neeraj.org.model.ResourceDtls;

public interface ResourceRepository extends JpaRepository<ResourceDtls, java.io.Serializable> {
	
	interface Result{
		
	}
	
	
	interface FetchResult extends Result{
		Integer getResourceId();
		String getResourceName();
	}
	
	interface FetchResult1 extends Result{
		String getResourceName();
		String getResourceExp();
	}
	
	//using generics to avoid cce and to achieve dynamic projection
	<T extends Result> List<T> findByResourceSkill(String skill, Class<T> type);

}
