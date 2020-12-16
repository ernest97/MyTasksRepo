package com.architectureapp.myTask.test;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.architectureapp.myTask.controller.TaskController;
import com.architectureapp.myTask.entity.TaskEntity;
import com.architectureapp.myTask.service.TaskService;



@WebMvcTest(ControllerTest.class)
class ControllerTest {
	
	

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private TaskService service;
//
//	@Test
//	void testlist() throws Exception {
//		TaskEntity task1 = new TaskEntity(1,"Tarea1", "Tarea1 Descripcion", "Pendiente");
//		TaskEntity task2 = new TaskEntity(2,"Tarea2", "Tarea2 Descripcion", "Completada");
//		TaskEntity task3 = new TaskEntity(3,"Tarea3", "Tarea3 Descripcion", "Pendiente");
//		
//		List<TaskEntity> list = new ArrayList<TaskEntity>();
//		
//		list.add(task1);
//		list.add(task2);
//		list.add(task3);
//		
//		when(service.list()).thenReturn(list);
//		
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/tasks")
//				.accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result = mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().json("[{'id':1,'name':'Tarea1','description':'Tarea1 Descripcion','state':'Pendiente'},"
//						+ "{'id':2,'name':'Tarea2','description':'Tarea2 Descripcion','state':'Completada'},"
//						+ "{'id':3,'name':'Tarea3','description':'Tarea3 Descripcion','state':'Pendiente'}]"))
//				.andReturn();
//	}
//	
//	@Test
//	void testlistCompleted() throws Exception {
//		
//		TaskEntity task2 = new TaskEntity(2,"Tarea2", "Tarea2 Descripcion", "Completada");
//		TaskEntity task4 = new TaskEntity(4,"Tarea4", "Tarea4 Descripcion", "Completada");
//		
//		List<TaskEntity> list = new ArrayList<TaskEntity>();
//		
//
//		list.add(task2);
//		list.add(task4);
//		
//		when(service.listaCompletadas()).thenReturn(list);
//		
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/completedTasks")
//				.accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result = mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().json("[{'id':2,'name':'Tarea2','description':'Tarea2 Descripcion','state':'Completada'},"
//						+ "{'id':4,'name':'Tarea4','description':'Tarea4 Descripcion','state':'Completada'}]"))
//				.andReturn();
//	}
//	
//	@Test
//	void testgetTasks() throws Exception {
//		
//		TaskEntity task = new TaskEntity(2,"Tarea2", "Tarea2 Descripcion", "Completada");
//		
//		when(service.getTask(2)).thenReturn(task);
//		
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/task/2")
//				.accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result = mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().json("{'id':2,'name':'Tarea2','description':'Tarea2 Descripcion','state':'Completada'}"))
//				.andReturn();
//	}
//	



}



