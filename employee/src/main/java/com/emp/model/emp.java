package com.emp.model;

public class emp {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "emp [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
