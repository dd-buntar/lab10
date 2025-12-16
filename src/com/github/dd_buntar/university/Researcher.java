package com.github.dd_buntar.university;

import java.util.Arrays;
import java.util.Objects;

public class Researcher extends Employee {
	@Override
	public String toString() {
		return "Researcher{" +
				super.getName() +
				", researchArea='" + researchArea + '\'' +
				", projects=" + Arrays.toString(projects) +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Researcher that = (Researcher) o;
		return Objects.equals(researchArea, that.researchArea) && Arrays.equals(projects, that.projects);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(super.hashCode(), researchArea);
		result = 31 * result + Arrays.hashCode(projects);
		return result;
	}

	private String researchArea;
	private Project[] projects;

	public Researcher(String socialSecurityNumber,
					  String name,
					  String email,
					  String researchArea,
					  Project[] projects) {
		super(socialSecurityNumber, name, email);
		this.researchArea = researchArea;
		this.projects = projects;
	}

	public String getResearchArea() {
		return this.researchArea;
	}

	public Project[] getProjects() {
		return this.projects;
	}

}