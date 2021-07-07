/**
 * 
 */
package com.iht.fbs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * @author Bharat
 *
 */
@Entity
@Table(name = "ScheduledFlight")
@Data
public class ScheduledFlight implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="schedule_flight_id")
	private Long scheduleFlightId;
	private Long userId;
	private Long userIdUpdate;
	private Long flightId;
	@Temporal(TemporalType.DATE)
	private Date arrival;
	private String sourceAirport;
	@Temporal(TemporalType.DATE)
	private Date departure;
	 
	private String departureTime;
	 
	private String arrivalTime;
	private String destination;
	private Long availableSeats;
	@Temporal(TemporalType.DATE)
	private Date dateCreate;
	@Temporal(TemporalType.DATE)
	private Date updateDate;

}
