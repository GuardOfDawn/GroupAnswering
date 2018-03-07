package cn.zy.GroupAnswering.bl.vo;

import lombok.Data;

@Data
public class QuestionVO {

	private int id;
	private String type;
	private String stem;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	
}
