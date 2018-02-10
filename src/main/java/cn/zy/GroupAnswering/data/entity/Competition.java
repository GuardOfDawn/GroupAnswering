package cn.zy.GroupAnswering.data.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@Data
@Entity
@Table(name = "competition")
public class Competition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Basic
    @Column(name = "number")
	private int number;
	
	@Basic
    @Column(name = "created_at")
    private LocalDateTime createdAt;
	
	@Basic
    @Column(name = "start_at")
    private LocalDateTime startAt;
	
	@Basic
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
	
	@ManyToMany(targetEntity = Question.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(name = "competition_questions", 
				joinColumns = @JoinColumn(name = "competition_id", referencedColumnName = "id"), 
				inverseJoinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"))
	private List<Question> questionList;
	
}
