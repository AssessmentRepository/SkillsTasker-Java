package in.SkillsTasker.service;

import java.util.List;

import in.SkillsTasker.model.Skills;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface SkillsService {
	
	Boolean addSkills(Skills skills);

	Skills getSkillsById(Integer skill_Id);

	List<Skills> listAllSkills();

	void editSkills(Integer skill_Id, Skills skills);
	
	void removeSkills(Integer skill_Id);
}
