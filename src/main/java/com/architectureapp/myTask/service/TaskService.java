package com.architectureapp.myTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.architectureapp.myTask.entity.TaskEntity;
import com.architectureapp.myTask.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> list() {

        var it = taskRepository.findAll();

        var users = new ArrayList<TaskEntity>();
        it.forEach(e -> users.add(e));

        return users;
    }
    
    public Long count() {
    	return taskRepository.count();
    }
    
    public void newTask (TaskEntity task) {
    	taskRepository.save(task);
    }

    public void deleteById(int userId) {
    	taskRepository.deleteById(userId);
    }
}