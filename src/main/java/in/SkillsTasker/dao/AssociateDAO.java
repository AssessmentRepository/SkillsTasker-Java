package in.SkillsTasker.dao;

import java.util.List;

import in.SkillsTasker.model.Associate;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface AssociateDAO {
	
	void addAssociate(Associate associate);

	Associate getAssociateById(Integer associate_Id);

	List<Associate> listAllAssociates();

	void editAssociate(Integer associate_Id, Associate associate);

	void removeAssociate(Integer associate_Id);
}
