package com.architectureapp.myTask.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.architectureapp.myTask.controller.TaskController;
import com.architectureapp.myTask.entity.TaskEntity;
import com.architectureapp.myTask.service.TaskService;


//@ExtendWith(SpringExtension.class)
public class TaskTest {
	
	
//	@InjectMocks
//	TaskService taskService;
//	
//	@Mock
//	TaskController controllerMock;
	
//	@Test
//	public void getListTest()
//	{
//	    List<TaskEntity> list = new ArrayList<TaskEntity>();
//	    TaskEntity task1 = new TaskEntity("TareaTest1", "TareaTest1 descripcion", "Pendiente");
//	    TaskEntity task2 = new TaskEntity("TareaTest1", "TareaTest1 descripcion", "Pendiente");
//	    TaskEntity task3 = new TaskEntity("TareaTest1", "TareaTest1 descripcion", "Pendiente");
//	     
//	    list.add(task1);
//	    list.add(task2);
//	    list.add(task3);
//	     
//	    when(controllerMock.listTask()).thenReturn(list);
//	     
//	    //test
//	    List<TaskEntity> taskList = taskService.list();
//	     
//	    assertEquals(3, taskList.size());
//	}
	
//	@Test
//	void testAdd() {
//		TaskEntity task = new TaskEntity("TareaTest", "TareaTestDescrpcion","Pendiente");
//		when(taskService.addTask(task).thenReturn(Mono.just(task));
////		mock(controller.putTask(task));
////		assertEquals(task,taskService.getTask(task.getId()));
////		assertEquals(6,6);
//	}
	
//	@Test
//	void testDelete() {
//		
//	}
//	
//	@Test
//	void testUpdate() {
//		
//	}
//	
//	@Test
//	void testGet() {
//		
//	}
}

//
//@InjectMocks
//EmployeeManager manager;
// 
//@Mock
//EmployeeDao dao;
//
//@Before
//public void init() {
//    MockitoAnnotations.initMocks(this);
//}
// 
//@Test
//public void getAllEmployeesTest()
//{
//    List<EmployeeVO> list = new ArrayList<EmployeeVO>();
//    EmployeeVO empOne = new EmployeeVO(1, "John", "John", "howtodoinjava@gmail.com");
//    EmployeeVO empTwo = new EmployeeVO(2, "Alex", "kolenchiski", "alexk@yahoo.com");
//    EmployeeVO empThree = new EmployeeVO(3, "Steve", "Waugh", "swaugh@gmail.com");
//     
//    list.add(empOne);
//    list.add(empTwo);
//    list.add(empThree);
//     
//    when(dao.getEmployeeList()).thenReturn(list);
//     
//    //test
//    List<EmployeeVO> empList = manager.getEmployeeList();
//     
//    assertEquals(3, empList.size());
//    verify(dao, times(1)).getEmployeeList();
//}