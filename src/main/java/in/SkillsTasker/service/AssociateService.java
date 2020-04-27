package in.SkillsTasker.service;

import java.util.List;

import in.SkillsTasker.model.Associate;

/**
 * @author B Shashidhar
 *
 * 
 */
public interface AssociateService {

	Boolean addAssociate(Associate associate);

	Associate getAssociateById(Integer associate_Id);

	List<Associate> listAllAssociates();

	void editAssociate(Integer associate_Id, Associate associate);

	void removeAssociate(Integer associate_Id);
}
