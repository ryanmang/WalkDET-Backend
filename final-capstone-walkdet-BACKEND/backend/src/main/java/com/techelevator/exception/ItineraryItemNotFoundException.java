package com.techelevator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class ItineraryItemNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6496636871895507014L;
	
	private String username;

	public ItineraryItemNotFoundException(String username, String message) {
		super(message);
		setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}