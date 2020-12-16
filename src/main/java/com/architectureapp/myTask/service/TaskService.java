package com.architectureapp.myTask.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        var tasks = new ArrayList<TaskEntity>();
        it.forEach(t -> tasks.add(t));

        return tasks;
    }
    
    public List<TaskEntity> listaCompletadas() {

        var it = taskRepository.findAll();

        var completas = new ArrayList<TaskEntity>();
        
        for(TaskEntity t : it) {
        	if(t.getState().equals("Completada")) {
        		completas.add(t);
        	}
        }
        return completas;
    }
    
    public Long count() {
    	return taskRepository.count();
    }
    
    public TaskEntity getTask(int id) {
    	Optional<TaskEntity> op = taskRepository.findById(id);
    	if(op.isEmpty()) {
    		return null;
    	} else {
    		return op.get();
    	}
    }
    
    public void addTask (TaskEntity task) {
    	taskRepository.save(task);
    }
    
	public void updateTask(int id, String name, String description, String state) {
		TaskEntity oldTask = taskRepository.findById(id).get();
		oldTask.setName(name);
		oldTask.setDescription(description);
		oldTask.setState(state);
		taskRepository.save(oldTask);
	}

//    public void updateEstado (int id, String estado) {
//        TaskEntity oldTask = taskRepository.findById(id).get();
//        oldTask.setState(estado);
//        taskRepository.save(oldTask);
//    }

    public void deleteById(int userId) {
    	taskRepository.deleteById(userId);
    }
}