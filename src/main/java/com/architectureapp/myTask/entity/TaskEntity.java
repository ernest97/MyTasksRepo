package com.architectureapp.myTask.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class TaskEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	private String state;
	
	protected TaskEntity() {}

	  public TaskEntity(String name, String description,String state) {
	    this.name = name;
	    this.description = description;
	    this.state = state;
	  }
	  
	  /*
	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }
	  */

	  public int getId() {
	    return id;
	  }

	  public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
	    return name;
	  }

	  public String getState() {
	    return state;
	  }

}
