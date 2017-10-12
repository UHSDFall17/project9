package com.sdproject.group9.model;

import java.util.List;

public class Collection {
	private String collectionName;
	private List<Task> tasks;

	public Collection(String name) {
		collectionName = name;
	}

	public Collection() {
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
