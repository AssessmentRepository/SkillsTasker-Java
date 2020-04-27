package in.SkillsTasker.dao;

import java.util.List;

import in.SkillsTasker.model.AssociateSkills;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface AssociateSkillsDAO {
	
	void addAssociateSkills(AssociateSkills associateSkills);

	AssociateSkills getAssociateSkillsById(Integer associate_Id);

	List<AssociateSkills> listAllAssociateSkills();

	void editAssociateSkills(Integer associate_Id, AssociateSkills associateSkills);
	
	void removeAssociateSkills(Integer associate_Id);
}
