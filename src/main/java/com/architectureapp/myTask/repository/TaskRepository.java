package com.architectureapp.myTask.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.architectureapp.myTask.entity.TaskEntity;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Integer>{}


