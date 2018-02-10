package cn.zy.GroupAnswering.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.zy.GroupAnswering.data.entity.Question;

public interface QuestionDao extends JpaRepository<Question, Integer> {

}
