package cn.zy.GroupAnswering.bl.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CompetitionVO {

	private int id;
	private int number;
	private LocalDateTime startAt;
	
}
