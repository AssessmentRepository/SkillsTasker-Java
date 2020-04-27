package in.SkillsTasker.model;

import javax.persistence.Id;

import lombok.Data;

/**
 * @author B Shashidhar
 *
 * 
 */
@Data
public class AssociateSkills {
	@Id
	private Integer associate_Id;
	private Integer skill_Id;

}
