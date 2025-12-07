package com.example.repository;

import com.example.entity.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepo extends JpaRepository<Task, Long> {
	
	List<Task> findByDeveloperId(Long developerId);
	
}
