package com.iht.fbs.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * 
 * @author Bharat
 *
 */

@Data
public class FlightDTO implements Serializable {

	private Long id;
	private String flightNumber;
	private String carrierName;
	private String flightModel;
	private Long price;
	private Long seatCapacity;
	private boolean isActive;
	private Long userId;
	private Long userIdUpdate;
	private Date createdDate;
	private String departureTime;
	private String sourceAirport;

	private Date departure;
	private String destination;

}
