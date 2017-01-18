package com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.model;

/**
 * @author DavidMS
 *
 */
public class UserDTO {

	/**
	 * The name
	 */
	private String name;

	private String surname;

	private String email;

	/**
	 * The constructor
	 * 
	 * @param name
	 *            the name
	 * @param password
	 *            the password
	 */
	public UserDTO(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	/**
	 * Gets the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the password
	 * 
	 * @param name
	 *            the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the surname
	 * 
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the surname
	 * 
	 * @param password
	 *            the surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Gets the email
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email
	 * 
	 * @param email
	 *            the mail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
