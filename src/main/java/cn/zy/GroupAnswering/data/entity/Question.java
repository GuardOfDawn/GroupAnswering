package cn.zy.GroupAnswering.data.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "question")
public class Question {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	//分类
	@Basic
    @Column(name = "type", unique = false)
    private String type;
	
	//题干
	@Basic
    @Column(name = "stem", unique = false)
    private String stem;
	
	//选项A
	@Basic
    @Column(name = "optionA", unique = false)
    private String optionA;
	
	//选项B
	@Basic
    @Column(name = "optionB", unique = false)
    private String optionB;
	
	//选项C
	@Basic
    @Column(name = "optionC", unique = false)
    private String optionC;
	
	//选项D
	@Basic
    @Column(name = "optionD", unique = false)
    private String optionD;
	
	//答案
	@OneToOne(cascade={CascadeType.ALL})
	@PrimaryKeyJoinColumn
    private Answer answer;
	
	@ManyToMany(mappedBy = "questionList")
	private List<Competition> competitionList;
	
}
