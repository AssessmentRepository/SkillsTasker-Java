package in.SkillsTasker.serviceImplTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import in.SkillsTasker.UtilTestClass.MasterData;
import in.SkillsTasker.dao.AssociateDAO;
import in.SkillsTasker.dao.AssociateSkillsDAO;
import in.SkillsTasker.dao.SkillsDAO;
import in.SkillsTasker.model.Associate;
import in.SkillsTasker.model.AssociateSkills;
import in.SkillsTasker.model.Skills;
import in.SkillsTasker.service.AssociateServiceImpl;
import in.SkillsTasker.service.AssociateSkillsServiceImpl;
import in.SkillsTasker.service.SkillsServiceImpl;

/**
 * @author B Shashidhar
 *
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class SkillsTaskerServiceImplTest {

	@Mock
	private AssociateDAO associateDAO;
	@Mock
	private AssociateSkillsDAO associateSkillsDAO;
	@Mock
	private SkillsDAO skillsDAO;

	@Mock
	private Associate associate;
	@Mock
	private AssociateSkills associateSkills;
	@Mock
	private Skills skills;

	@InjectMocks
	private AssociateServiceImpl associateServiceImpl;
	
	@InjectMocks
	private AssociateSkillsServiceImpl associateSkillsServiceImpl;
	
	@InjectMocks
	private SkillsServiceImpl skillsServiceImpl;


	@Test
	public void testSaveAssociateImplTest() throws Exception {
		Boolean value = associateServiceImpl.addAssociate(MasterData.getAssociateDetails());
		assertEquals(Boolean.TRUE, value);
	}
	@Test
	public void testSaveAssociateSkillsImplTest() throws Exception {
		Boolean value = associateSkillsServiceImpl.addAssociateSkills(MasterData.getAssociateSkillsDetails());
		assertEquals(Boolean.TRUE, value);
	}
	@Test
	public void testSaveSkillsImplTest() throws Exception {
		Boolean value = skillsServiceImpl.addSkills(MasterData.getSkillsDetails());
		assertEquals(Boolean.TRUE, value);
	}

	@Test
	public void testGetAssociateImplTest() throws Exception {
		associate = associateServiceImpl.getAssociateById(MasterData.getAssociateDetails().getAssociate_Id());
		when(associateDAO.getAssociateById(1)).thenReturn(null);
		Associate res = associateServiceImpl.getAssociateById(1);
		assertEquals(null, res);
	}
	@Test
	public void testGetAssociateSkillsImplTest() throws Exception {
		associateSkills = associateSkillsServiceImpl.getAssociateSkillsById(MasterData.getAssociateSkillsDetails().getAssociate_Id());
		when(associateSkillsDAO.getAssociateSkillsById(1)).thenReturn(null);
		AssociateSkills res = associateSkillsServiceImpl.getAssociateSkillsById(1);
		assertEquals(null, res);
	}
	@Test
	public void testGetSkillsImplTest() throws Exception {
		skills = skillsServiceImpl.getSkillsById(MasterData.getSkillsDetails().getSkill_Id());
		when(skillsDAO.getSkillsById(1)).thenReturn(null);
		Skills res = skillsServiceImpl.getSkillsById(1);
		assertEquals(null, res);
	}

//	@Test
//	public void testViewAllUsersImplTest() throws Exception {
//		List<User> userList = new ArrayList<>();
//		userList.add(new User());
//		userList.add(new User());
//		when(userDao.listUser()).thenReturn((List) userList);
//		List<User> list = userServiceImp.listUser();
//		assertEquals(2, list.size());
//	}

//	@Test
//	public void testViewAllUsersImplTest1() throws Exception {
//		List<User> userList = new ArrayList<>();
//		when(userDao.listUser()).thenReturn((List) userList);
//		List<User> list = userServiceImp.listUser();
//		assertEquals(Collections.EMPTY_LIST, list);
//	}

//	@Test
//	public void testViewAllUsersImplTest2() throws Exception {
//		when(userDao.listUser()).thenReturn(null);
//		List<User> list = userServiceImp.listUser();
//		assertEquals(null, list);
//	}
	
	@Test
	public void testDeleteAssociateImplTest() throws Exception {
		associate = associateServiceImpl.getAssociateById(MasterData.getAssociateDetails().getAssociate_Id());
		when(associateDAO.getAssociateById(1)).thenReturn(associate).thenReturn(null);
		Associate res = associateServiceImpl.getAssociateById(1);
		assertEquals(null, res);
	}
	@Test
	public void testDeleteAssociateSkillsImplTest() throws Exception {
		associateSkills = associateSkillsServiceImpl.getAssociateSkillsById(MasterData.getAssociateSkillsDetails().getAssociate_Id());
		when(associateSkillsDAO.getAssociateSkillsById(1)).thenReturn(associateSkills).thenReturn(null);
		AssociateSkills res = associateSkillsServiceImpl.getAssociateSkillsById(1);
		assertEquals(null, res);
	}
	@Test
	public void testDeleteSkillsImplTest() throws Exception {
		skills = skillsServiceImpl.getSkillsById(MasterData.getSkillsDetails().getSkill_Id());
		when(skillsDAO.getSkillsById(1)).thenReturn(skills).thenReturn(null);
		Skills res = skillsServiceImpl.getSkillsById(1);
		assertEquals(null, res);
	}
}
