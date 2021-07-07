package com.iht.fbs.adaptor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.iht.fbs.dto.PassengersDTO;
import com.iht.fbs.model.Booking;
import com.iht.fbs.model.Passengers;

/**
 * bharat
 */
@Component
public class PassengerAdaptor implements Adaptor<PassengersDTO, Passengers> {

	@Override
	public List<Passengers> uiDtoToDatabaseModelList(List<PassengersDTO> uiobj) {
		return uiobj.stream().map(item -> uiDtoToDatabaseModel(item)).collect(Collectors.toList());
	}

	@Override
	public List<PassengersDTO> databaseModelToUiDtoList(List<Passengers> dbobj) {
		return dbobj.stream().map(item -> databaseModelToUiDto(item)).collect(Collectors.toList());
	}

	@Override
	public Passengers uiDtoToDatabaseModel(PassengersDTO uiobj) {
		Passengers passenger = new Passengers();

		// BeanUtils.copyProperties(uiobj, passenger);
		passenger.setPassengerId(uiobj.getPassengerId());
		passenger.setEmailId(uiobj.getEmailId());
		passenger.setFirstName(uiobj.getFirstName());
	//	passenger.setLastName(uiobj.getLastName());
	//	passenger.setAddress(uiobj.getAddress());
		passenger.setMobileNo(uiobj.getMobileNo());
		// Booking booking = new Booking();
		// booking.setBookingId(uiobj.getBookingId());
//		Booking book = new Booking();
//		book.setBookingId(uiobj.getBookingId());
		// passenger.setBookingId(uiobj.getBookingId());
		return passenger;
	}

	@Override
	public PassengersDTO databaseModelToUiDto(Passengers uiobj) {
		PassengersDTO dto = new PassengersDTO();

		// BeanUtils.copyProperties(uiobj, passenger);
		dto.setPassengerId(uiobj.getPassengerId());
		dto.setEmailId(uiobj.getEmailId());
		dto.setFirstName(uiobj.getFirstName());
		//dto.setLastName(uiobj.getLastName());
		//dto.setAddress(uiobj.getAddress());
		dto.setMobileNo(uiobj.getMobileNo());
		dto.setBookingId(uiobj.getBooking().getBookingId());

		return dto;
	}

}