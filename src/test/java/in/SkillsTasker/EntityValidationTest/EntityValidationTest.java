package in.SkillsTasker.EntityValidationTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

import in.SkillsTasker.UtilTestClass.MasterData;
import in.SkillsTasker.model.Associate;
import in.SkillsTasker.model.AssociateSkills;
import in.SkillsTasker.model.Skills;

/**
 * @author B Shashidhar
 *
 * 
 */
public class EntityValidationTest {

	private Validator validator;

	@Before
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void testAssociateSuccess() {
		Associate associate = MasterData.getAssociateDetails();
		Set<ConstraintViolation<Associate>> violations = validator.validate(associate);
		assertTrue(violations.isEmpty());
	}

	public void testAssociateSkillsSuccess() {
		AssociateSkills associateSkills = MasterData.getAssociateSkillsDetails();
		Set<ConstraintViolation<AssociateSkills>> violations = validator.validate(associateSkills);
		assertTrue(violations.isEmpty());
	}

	public void testSkillsSuccess() {
		Skills skills = MasterData.getSkillsDetails();
		Set<ConstraintViolation<Skills>> violations = validator.validate(skills);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testName() {
		Associate associate = MasterData.getAssociateDetails();
		associate.setName("associate-1");
		int maxChar = 10;
		boolean name = ((associate.getName().length()) >= maxChar);
		assertEquals(name, true);
	}

	@Test
	public void testRemark() {
		Associate associate = MasterData.getAssociateDetails();
		associate.setRemark("No remark");
		int no = 5;
		boolean remark = ((associate.getRemark().length()) >= no);
		assertEquals(remark, true);
	}

	@Test
	public void testMobile() {
		Associate associate = MasterData.getAssociateDetails();
		associate.setMobile("9876543210");
		int no = 10;
		boolean name = ((associate.getMobile().length()) >= no);
		assertEquals(name, true);
	}

	@Test
	public void testLevelLength() {
		Associate associate = MasterData.getAssociateDetails();
		associate.getLevel_1();
		int maxChar = 3;
		boolean level = ((associate.getStatus_Green().length()) >= maxChar);
		assertEquals(level, true);
	}

	@Test
	public void testStatus_Green_Length() {
		Associate associate = MasterData.getAssociateDetails();
		associate.getStatus_Green();
		int maxChar = 3;
		boolean status = ((associate.getStatus_Green().length()) >= maxChar);
		assertEquals(status, true);
	}

	@Test
	public void testSkillName() {
		Skills skills = MasterData.getSkillsDetails();
		skills.getSkill_Name();
		int maxChar = 10;
		boolean usernameLength = ((skills.getSkill_Name().length()) >= maxChar);
		assertEquals(usernameLength, true);
	}
}