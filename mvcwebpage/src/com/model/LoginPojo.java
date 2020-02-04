package com.model;

public class LoginPojo {
	private String username;
	private String password;
	private String Role;

	public LoginPojo() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;

	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

}
