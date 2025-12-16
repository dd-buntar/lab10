package com.github.dd_buntar.university;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Project {

	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Map<Researcher, Integer> researches;

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", researches=" + researches +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return Objects.equals(name, project.name) && Objects.equals(startDate, project.startDate) && Objects.equals(endDate, project.endDate) && Objects.equals(researches, project.researches);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, startDate, endDate, researches);
	}

	public Project(String name, LocalDateTime startDate, LocalDateTime endDate, Map<Researcher, Integer> researches) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.researches = researches;
	}

	public String getName() {
		return this.name;
	}

	public LocalDateTime getStartDate() {
		return this.startDate;
	}

	public LocalDateTime getEndDate() {
		return this.endDate;
	}

	public Map<Researcher, Integer> getResearches() {
		return this.researches;
	}

	public void submitForApproval() {
		// TODO - implement Project.submitForApproval
		throw new UnsupportedOperationException();
	}

	public void reviseProject() {
		// TODO - implement Project.reviseProject
		throw new UnsupportedOperationException();
	}

}