package com.websystique.springmvc.model;

import javax.validation.constraints.NotNull;

public class UserLogin {

	@NotNull
	private String username;
	
	
	@NotNull
	private String password;
	
	
	public UserLogin() {
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
