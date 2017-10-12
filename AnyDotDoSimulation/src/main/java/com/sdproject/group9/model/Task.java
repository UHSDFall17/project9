package com.sdproject.group9.model;

import java.util.Date;
import java.util.List;

public class Task {

	private String name;
	private Date createdDate;
	private String collectionName;
	private boolean isNotificationSet;
	private boolean isStarred;
	private String Notes;
	private List<String> subTasks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public boolean isNotificationSet() {
		return isNotificationSet;
	}

	public void setNotificationSet(boolean isNotificationSet) {
		this.isNotificationSet = isNotificationSet;
	}

	public boolean isStarred() {
		return isStarred;
	}

	public void setStarred(boolean isStarred) {
		this.isStarred = isStarred;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public List<String> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(List<String> subTasks) {
		this.subTasks = subTasks;
	}

}
