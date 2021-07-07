package com.iht.fbs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Bharat
 *
 */
@Entity
@Table(name = "Flight")
@Data
public class Flight implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	private String flightNumber;
	private String carrierName;
	private String flightModel;
	private Long price;
	private Long seatCapacity;
	private String activeStatus;
	private Long userId;
	private Long userIdUpdate;
	private Date createdDate;
	
//	@OneToOne(mappedBy = "flight")
//    private Booking booking ;

}
