package com.iht.fbs.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PassengersDTO implements Serializable {
	private Long passengerId;
	private String firstName;
	private String lastName;
	private String address;
	private String emailId;
	private String mobileNo;
	private Long bookingId;
}
