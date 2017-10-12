package com.sdproject.group9.model;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Preference {
	private boolean isDesktopNotificationsSet;
	private int timeFormat;
	private DayOfWeek weekStartDay;
	private SimpleDateFormat dateFormat;
	private List<Collection> defaultCollections;

	public Preference() {
		setDefaultCollections(null);
	}

	public boolean isDesktopNotificationsSet() {
		return isDesktopNotificationsSet;
	}

	public void setDesktopNotificationsSet(boolean isDesktopNotificationsSet) {
		this.isDesktopNotificationsSet = isDesktopNotificationsSet;
	}

	public int getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(int timeFormat) {
		this.timeFormat = timeFormat;
	}

	public DayOfWeek getWeekStartDay() {
		return weekStartDay;
	}

	public void setWeekStartDay(DayOfWeek weekStartDay) {
		this.weekStartDay = weekStartDay;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public List<Collection> getDefaultCollections() {
		return defaultCollections;
	}

	public void setDefaultCollections(List<Collection> defaultCollections) {
		if (defaultCollections == null || defaultCollections.isEmpty()) {
			this.defaultCollections = new ArrayList<Collection>();
			this.defaultCollections.add(new Collection("GROCERY LIST"));
			this.defaultCollections.add(new Collection("PERSONAL ERRANDS"));
		} else {
			this.defaultCollections = defaultCollections;
		}
	}

}
