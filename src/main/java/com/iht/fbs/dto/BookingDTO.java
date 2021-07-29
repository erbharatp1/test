/**
 * 
 */
package com.iht.fbs.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author User
 *
 */

//@Data
public class BookingDTO implements Serializable {
	
	private Long bookingId;
	private Long pnrNo;
	private String origin;
	private String destination;
	private String trip;
	private Date journeyFromDate;
	private Date journeyToDate;
	private String mealOnePreference;
	private String mealRoundPreference;
	private Double price;
	private String ticketStatus;
	private Double discount;
	private Long userId;
	private Long flightId;
	private Long userIdUpdate;
	private Long noOfPassengers;
	private Date createdDate;
	private List<PassengersDTO> passengerList;
	
	public BookingDTO() {
		super();
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(Long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrip() {
		return trip;
	}
	public void setTrip(String trip) {
		this.trip = trip;
	}
	public Date getJourneyFromDate() {
		return journeyFromDate;
	}
	public void setJourneyFromDate(Date journeyFromDate) {
		this.journeyFromDate = journeyFromDate;
	}
	public Date getJourneyToDate() {
		return journeyToDate;
	}
	public void setJourneyToDate(Date journeyToDate) {
		this.journeyToDate = journeyToDate;
	}
	public String getMealOnePreference() {
		return mealOnePreference;
	}
	public void setMealOnePreference(String mealOnePreference) {
		this.mealOnePreference = mealOnePreference;
	}
	public String getMealRoundPreference() {
		return mealRoundPreference;
	}
	public void setMealRoundPreference(String mealRoundPreference) {
		this.mealRoundPreference = mealRoundPreference;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public Long getUserIdUpdate() {
		return userIdUpdate;
	}
	public void setUserIdUpdate(Long userIdUpdate) {
		this.userIdUpdate = userIdUpdate;
	}
	public Long getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Long noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public List<PassengersDTO> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<PassengersDTO> passengerList) {
		this.passengerList = passengerList;
	}

	
	
}
