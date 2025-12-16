package com.github.dd_buntar.university;

import java.util.Arrays;

public class Lecturer extends Researcher {

	private Course[] courses;

	@Override
	public String toString() {
		return "Lecturer{" +
				"courses=" + Arrays.toString(courses) +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Lecturer lecturer = (Lecturer) o;
		return Arrays.equals(courses, lecturer.courses);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + Arrays.hashCode(courses);
		return result;
	}

	public Lecturer(String socialSecurityNumber, String name, String email, String researchArea, Project[] projects, Course[] courses) {
		super(socialSecurityNumber, name, email, researchArea, projects);
		this.courses = courses;
	}

	public void deliverLecture() {
		// TODO - implement Lecturer.deliverLecture
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void teachCourse(Course course) {
		// TODO - implement Lecturer.teachCourse
		throw new UnsupportedOperationException();
	}

	public Course[] getCourses() {
		return this.courses;
	}

	/**
	 * 
	 * @param courses
	 */
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

}