package com.example.demo.request;

import jakarta.validation.constraints.NotBlank;

public class AuthRequest {
	@NotBlank(message = "User name is not blank")
	private String username;
	@NotBlank(message = "Password is not blank")
	private String password;

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

}
