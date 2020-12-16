package com.architectureapp.myTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	/**
	 * Lista de tareas completadas
	 * @param task
	 */
	@RequestMapping(value="/completedTasks",method=RequestMethod.GET)
	public List<TaskEntity> completedTask () {
		return taskService.listaCompletadas();
	}
	
	@RequestMapping(value="/addTask",method=RequestMethod.POST)
	public void postTask (TaskEntity task) {
		taskService.addTask(task);
	}
	
//	@RequestMapping(value = "/state", method = RequestMethod.POST)
//	public void updateEstado(int id, String state) {
//		taskService.updateEstado(id, state);
//	}
	
	@RequestMapping(value="/updateTask",method=RequestMethod.POST)
	public void updateTask(int id, String name, String description, String state) {
		taskService.updateTask(id, name, description, state);
	}

	@RequestMapping(value="/task/{id}",method=RequestMethod.GET)
	public TaskEntity getTask (@PathVariable int id) {
		return taskService.getTask(id);
	}
	
	@RequestMapping(value="/delTask/{id}",method=RequestMethod.DELETE)
	public void deleteTask (@PathVariable int id) {
		taskService.deleteById(id);
	}
}
