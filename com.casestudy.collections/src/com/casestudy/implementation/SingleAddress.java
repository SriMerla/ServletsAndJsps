package com.casestudy.implementation;

import java.io.Serializable;

public class SingleAddress implements Serializable{
	
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private long postalCode;
	
	public SingleAddress(String firstName, String lastName,
			String streetAddress, String city, String state, String country,
			long postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
	}

	public String toString() {
		return "SingleAddress [firstName=" + firstName + ", lastName="
				+ lastName + ", streetAddress=" + streetAddress + ", city="
				+ city + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SingleAddress other = (SingleAddress) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public long getPostalCode() {
		return postalCode;
	}

}
