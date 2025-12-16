package com.github.dd_buntar.university;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Faculty {

	private String name;
	private Institute[] institutes;
	private Dean dean;

	@Override
	public String toString() {
		return "Faculty{" +
				"name='" + name + '\'' +
				", institutes=" + Arrays.stream(institutes).map(Institute::toString).collect(Collectors.joining(",\n\t\t", "[\n\t\t", "\n]")) +
				", dean=" + dean +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Faculty faculty = (Faculty) o;
		return Objects.equals(name, faculty.name) && Arrays.equals(institutes, faculty.institutes) && Objects.equals(dean, faculty.dean);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(name, dean);
		result = 31 * result + Arrays.hashCode(institutes);
		return result;
	}

	public Faculty(String name, Institute[] institutes, Dean dean) {
		this.name = name;
		this.institutes = institutes;
		this.dean = dean;
	}

	public String getName() {
		return this.name;
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	/**
	 * 
	 * @param dean
	 */
	public void setDean(Dean dean) {
		this.dean = dean;
	}

}