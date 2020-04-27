package in.SkillsTasker.controllerTest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.google.gson.Gson;

import in.SkillsTasker.UtilTestClass.MasterData;
import in.SkillsTasker.controller.SkillsTaskerController;
import in.SkillsTasker.service.AssociateService;
import in.SkillsTasker.service.AssociateSkillsService;
import in.SkillsTasker.service.SkillsService;

/**
 * @author B Shashidhar
 *
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@Mock
	private AssociateService associateService;
	@Mock
	private AssociateSkillsService associateSkillsService;
	@Mock
	private SkillsService skillsService;

	@InjectMocks
	private SkillsTaskerController skillsTaskerController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(skillsTaskerController).build();
	}

	@Test
	public void testLoadingPageUrl() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(status().isOk());
	}
	@Test
	public void testAssociateApi() throws Exception {
		Gson gson = new Gson();
		when(associateService.addAssociate(MasterData.getAssociateDetails())).thenReturn(false);
		this.mockMvc
				.perform(post("/addas").content(gson.toJson(MasterData.getAssociateDetails()))
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(view().name("record not saved"));

	}
	@Test
	public void testAssociateSkillsApi() throws Exception {
		Gson gson = new Gson();
		when(associateSkillsService.addAssociateSkills(MasterData.getAssociateSkillsDetails())).thenReturn(false);
		this.mockMvc
		.perform(post("/addas").content(gson.toJson(MasterData.getAssociateSkillsDetails()))
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andExpect(view().name("record not saved"));
		
	}
	@Test
	public void testSaveUsersApiTestCase1() throws Exception {
		Gson gson = new Gson();
		when(skillsService.addSkills(MasterData.getSkillsDetails())).thenReturn(false);
		this.mockMvc
		.perform(post("/addskill").content(gson.toJson(MasterData.getSkillsDetails()))
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andExpect(view().name("record not saved"));
		
	}
}
