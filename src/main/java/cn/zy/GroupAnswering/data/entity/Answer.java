package cn.zy.GroupAnswering.data.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "answer")
public class Answer {
	
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
	
	@Basic
    @Column(name = "answer", unique = false)
	private String answer;

}
