package in.neeraj.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Table(name="RESOURCE_TAB")
public class ResourceDtls {
	@Id
	@Column(name="RSRC_ID")
	private Integer resourceId;
	
	@Column(name="RSRC_NAME")
	private String resourceName;
	
	@Column(name="RSRC_SKILL")
	private String resourceSkill;
	
	@Column(name="RSRC_EXP")
	private String resourceExp;

}
