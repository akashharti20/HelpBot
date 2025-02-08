package com.help.bot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.help.bot.dto.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	List<Question> findByQuestionContainingIgnoreCase(String query);

	

}
