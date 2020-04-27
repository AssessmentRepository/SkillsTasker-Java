package in.SkillsTasker.model;

import javax.persistence.Id;

import lombok.Data;

/**
 * @author B Shashidhar
 *
 * 
 */
@Data
public class Associate {
	@Id
	private Integer associate_Id;
	private String name;
	private String mobile;
	private String pic;
	private String status_Green;
	private String status_Blue;
	private String status_Red;
	private String level_1;
	private String level_2;
	private String level_3;
	private String remark;
	private String strength;
	private String weakness;
}
