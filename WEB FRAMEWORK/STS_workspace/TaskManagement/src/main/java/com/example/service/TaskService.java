package com.example.service;

import com.example.entity.Task;

import com.example.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    // Create task (TEAM_LEAD)
    public Task createTask(Task task) {
        return taskRepo.save(task);
    }

    // Get all tasks (TEAM_LEAD)
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    // Assign task to developer (TEAM_LEAD)
    public Task assignTask(Long taskId, Long developerId) {
        Task task = taskRepo.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setDeveloperId(developerId);
        return taskRepo.save(task);
    }

    // Get developer tasks (DEVELOPER)
    public List<Task> getTasksByDeveloper(Long developerId) {
        return taskRepo.findByDeveloperId(developerId);
    }

    // Update only status (DEVELOPER)
    public Task updateStatus(Long taskId, String status) {
        Task task = taskRepo.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setStatus(status);
        return taskRepo.save(task);
    }

    // Delete task (TEAM_LEAD)
    public void deleteTask(Long taskId) {
        taskRepo.deleteById(taskId);
    }
}



