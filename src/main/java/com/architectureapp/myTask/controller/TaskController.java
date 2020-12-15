package com.architectureapp.myTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.architectureapp.myTask.entity.TaskEntity;
import com.architectureapp.myTask.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired 
	private TaskService taskService;
	
	@RequestMapping(value="/tasks",method=RequestMethod.GET)
	public List<TaskEntity> listTask () {
		return taskService.list();
	}
	
	@RequestMapping(value="/newTask",method=RequestMethod.POST)
	public void putTask (TaskEntity task) {
		taskService.newTask(task);
	}
	
	@RequestMapping(value="/delTask",method=RequestMethod.DELETE)
	public void deleteTask (int id) {
		taskService.deleteById(id);
	}
	
}
