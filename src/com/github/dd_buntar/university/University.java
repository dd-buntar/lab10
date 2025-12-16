package com.github.dd_buntar.university;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class University {

	private String name;
	private Integer numberOfEmployees;
	private Faculty[] faculties;

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "University{" +
				"name='" + name + '\'' +
				", numberOfEmployees=" + numberOfEmployees +
				", faculties=" + Arrays.stream(faculties).map(Faculty::toString).collect(Collectors.joining(",\n\t", "[\n\t", "\n]")) +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		University that = (University) o;
		return Objects.equals(name, that.name) && Objects.equals(numberOfEmployees, that.numberOfEmployees) && Arrays.equals(faculties, that.faculties);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(name, numberOfEmployees);
		result = 31 * result + Arrays.hashCode(faculties);
		return result;
	}

	public University(String name, Integer numberOfEmployees, Faculty[] faculties) {
		this.name = name;
		this.numberOfEmployees = numberOfEmployees;
		this.faculties = faculties;
	}

	public Integer getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public Faculty[] getFaculties() {
		return this.faculties;
	}

}