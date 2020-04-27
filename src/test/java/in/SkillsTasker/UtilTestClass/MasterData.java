package in.SkillsTasker.UtilTestClass;

import in.SkillsTasker.model.Associate;
import in.SkillsTasker.model.AssociateSkills;
import in.SkillsTasker.model.Skills;

/**
 * @author B Shashidhar
 *
 * 
 */
public class MasterData {
	public static Associate getAssociateDetails() {
		Associate associate = new Associate();
		associate.setAssociate_Id(1);
		associate.setName("associate-1");
		associate.setMobile("9876543210");
		associate.setPic("somthing/somthing");
		associate.setStatus_Green("yes");
		associate.setStatus_Blue("no");
		associate.setStatus_Red("no");
		associate.setLevel_1("L-1");
		associate.setLevel_2("no");
		associate.setLevel_3("no");
		associate.setRemark("no remark");
		associate.setStrength("coding");
		associate.setWeakness("emotional");
		return associate;
	}
	public static AssociateSkills getAssociateSkillsDetails() {
		AssociateSkills associateSkills = new AssociateSkills();
		associateSkills.setAssociate_Id(1);
		associateSkills.setSkill_Id(1);
		return associateSkills;
	}
	public static Skills getSkillsDetails() {
		Skills skills=new Skills();
		skills.setSkill_Id(1);
		skills.setSkill_Name("skill-Name");
		return skills;
	}

}