package com.github.dd_buntar.university;

import java.util.Objects;

public abstract class Employee {

	private String socialSecurityNumber;
	private String name;
	private String email;

	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public Employee(String socialSecurityNumber, String name, String email) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"socialSecurityNumber='" + socialSecurityNumber + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(socialSecurityNumber, employee.socialSecurityNumber) && Objects.equals(name, employee.name) && Objects.equals(email, employee.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(socialSecurityNumber, name, email);
	}
}