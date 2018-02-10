package cn.zy.GroupAnswering;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.zy.GroupAnswering.data.dao.CompetitionDao;
import cn.zy.GroupAnswering.data.dao.QuestionDao;
import cn.zy.GroupAnswering.data.entity.Competition;
import cn.zy.GroupAnswering.data.entity.Question;
import cn.zy.GroupAnswering.utility.TimeTransfer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupAnsweringApplicationTests {
	
	@Autowired
	QuestionDao questionDao;
	
	@Autowired
	CompetitionDao competitionDao;

	@Test
	public void contextLoads() {
		Competition competition = new Competition();
		competition.setId(1);
		competition.setCreatedAt(LocalDateTime.now());
		competition.setStartAt(TimeTransfer.transfer("2018-02-16 11:11:11"));
		List<Question> list = new ArrayList<>();
		list.add(questionDao.findOne(2));
		list.add(questionDao.findOne(1));
		competition.setQuestionList(list);
		competitionDao.save(competition);
	}

}
