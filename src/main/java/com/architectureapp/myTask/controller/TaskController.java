package com.architectureapp.myTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.architectureapp.myTask.entity.TaskEntity;
import com.architectureapp.myTask.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired  
	private TaskService taskService;
	
	@RequestMapping(value="/tasks",method=RequestMethod.GET, produces = "application/json")
	public List<TaskEntity> listTasks () {
		return taskService.list();
	}
	
	@RequestMapping(value="/completedTasks",method=RequestMethod.GET, produces = "application/json" )
	public List<TaskEntity> completedTasks () {
		return taskService.listaCompletadas();
	}
	
	@RequestMapping(value="/task",method=RequestMethod.POST, consumes = "application/json")
	public void addTask (@RequestBody TaskEntity task) {
		taskService.addTask(task);
	}
	
	@RequestMapping(value="/task/{id}",method=RequestMethod.PUT, consumes = "application/json")
	public void updateTask(@PathVariable int id, @RequestBody TaskEntity task) {
		taskService.updateTask(id, task);
	}

	@RequestMapping(value="/task/{id}",method=RequestMethod.GET, produces = "application/json")
	public TaskEntity getTask (@PathVariable int id) {
		return taskService.getTask(id);
	}
	
	@RequestMapping(value="/task/{id}",method=RequestMethod.DELETE)
	public void deleteTask (@PathVariable int id) {
		taskService.deleteById(id);
	}
}
