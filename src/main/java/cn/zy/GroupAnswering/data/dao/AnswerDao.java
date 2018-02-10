package cn.zy.GroupAnswering.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.zy.GroupAnswering.data.entity.Answer;

public interface AnswerDao extends JpaRepository<Answer, Integer> {

}
