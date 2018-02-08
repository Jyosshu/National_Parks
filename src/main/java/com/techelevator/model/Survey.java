package com.techelevator.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey {
	
	@NotBlank(message="Email is required")
	@Email(message="Not a valid email address")
	private String emailAddress;
	
	@NotBlank(message="A State must be selected")
	private String state;
	
	@NotBlank(message="Activity Level is required")
	private String activityLevel;
	
	@NotBlank(message="A Park must be selected")
	private String parkCode;
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(String physical) {
		this.activityLevel = physical;
	}

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String favoritePark) {
		this.parkCode = favoritePark;
	}
	
	
}
