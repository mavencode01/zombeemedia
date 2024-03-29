package com.zombeemedia.entity;

import org.codehaus.enunciate.json.JsonIgnore;
import org.codehaus.enunciate.json.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User extends BaseEntity {

	private String firstname;
	private String lastname;
	private String age;
	@JsonIgnore
	private String password;
	private Gender gender;
	private String email;
	private String profession;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
