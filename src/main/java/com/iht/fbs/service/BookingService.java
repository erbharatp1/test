/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Booking;

/**
 * @author Bharat
 *
 */

public interface BookingService {

	public Booking findBookingId(Long bookingId) throws ResourceNotFoundException;

	public Booking save(Booking booking);

	public List<Booking> findBookingList();

	public List<Booking> findBookingByUserId(Long userId);

	public void deleteById(Long id);

}
