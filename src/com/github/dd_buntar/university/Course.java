package com.github.dd_buntar.university;

import java.util.Objects;

public class Course {

	private Integer uniqueNumber;
	private String name;
	private Integer weeklyDuration;

	public Integer getUniqueNumber() {
		return this.uniqueNumber;
	}

	public String getName() {
		return this.name;
	}

	public Integer getWeeklyDuration() {
		return this.weeklyDuration;
	}

	/**
	 * 
	 * @param duration
	 */
	public void setWeeklyDuration(Integer duration) {
		this.weeklyDuration = duration;
	}

	public Course(Integer uniqueNumber, String name, Integer weeklyDuration) {
		this.uniqueNumber = uniqueNumber;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	@Override
	public String toString() {
		return "Course{" +
				"uniqueNumber=" + uniqueNumber +
				", name='" + name + '\'' +
				", weeklyDuration=" + weeklyDuration +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Course course = (Course) o;
		return Objects.equals(uniqueNumber, course.uniqueNumber) && Objects.equals(name, course.name) && Objects.equals(weeklyDuration, course.weeklyDuration);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniqueNumber, name, weeklyDuration);
	}
}