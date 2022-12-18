package com.lab.websec.backend.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorModel {

	private HttpStatus httpStatus;

    private LocalDateTime timestamp;

    private String statusText;

    private String details;

    public ErrorModel(HttpStatus httpStatus, String statusText, String details) {
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
        this.statusText = statusText;
        this.details = details;
    }

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getstatusText() {
		return statusText;
	}

	public void setstatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
