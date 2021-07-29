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
	public Long getScheduleFlightId() {
		return scheduleFlightId;
	}
	public void setScheduleFlightId(Long scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserIdUpdate() {
		return userIdUpdate;
	}
	public void setUserIdUpdate(Long userIdUpdate) {
		this.userIdUpdate = userIdUpdate;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Long getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Long availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ScheduledFlight [scheduleFlightId=" + scheduleFlightId + ", userId=" + userId + ", userIdUpdate="
				+ userIdUpdate + ", flightId=" + flightId + ", arrival=" + arrival + ", sourceAirport=" + sourceAirport
				+ ", departure=" + departure + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", destination=" + destination + ", availableSeats=" + availableSeats + ", dateCreate=" + dateCreate
				+ ", updateDate=" + updateDate + "]";
	}

}
