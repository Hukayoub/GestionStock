package com.sp.gestionStock.exception;

import java.util.List;

import lombok.Getter;

public class InvalidEntityException extends RuntimeException {

	@Getter
	private ErrorCodes errorCodes;
	@Getter
	private List<String> errors;
	
	public InvalidEntityException(String message) {
		super(message);
	}

	public InvalidEntityException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidEntityException(String message, Throwable cause, ErrorCodes errorCode) {
		super(message, cause);
		this.errorCodes = errorCode;
	}

	public InvalidEntityException(String message, ErrorCodes errorCode) {
		super(message);
		this.errorCodes = errorCode;
	}
	
	public InvalidEntityException(String message, ErrorCodes errorCodes, List<String> errors) {
		super(message);
		this.errorCodes = errorCodes;
		this.errors = errors;
	}
	
	
}
