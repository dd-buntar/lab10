package com.github.dd_buntar.university;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Institute {

	private String name;
	private String address;
	private Researcher[] researches;

	public Institute(String name, String address, Researcher[] researches) {
		this.name = name;
		this.address = address;
		this.researches = researches;
	}

	@Override
	public String toString() {
		return "Institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", researches=" + Arrays.stream(researches).map(Researcher::toString).collect(Collectors.joining(",\n\t\t\t", "[\n\t\t\t", "\n]")) +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Institute institute = (Institute) o;
		return Objects.equals(name, institute.name) && Objects.equals(address, institute.address) && Arrays.equals(researches, institute.researches);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(name, address);
		result = 31 * result + Arrays.hashCode(researches);
		return result;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public Researcher[] getResearches() {
		return this.researches;
	}

	/**
	 * 
	 * @param researches
	 */
	public void setResearches(Researcher[] researches) {
		this.researches = researches;
	}

}