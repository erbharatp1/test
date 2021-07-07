/**
 * 
 */
package com.iht.fbs.service;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Booking;
import com.iht.fbs.repository.BookingRepository;

/**
 * @author Bharat
 *
 */
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public Booking findBookingId(Long bookingId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return bookingRepository.findById(bookingId)
				.orElseThrow(() -> new ResourceNotFoundException("booking not found for this id :: " + bookingId));

	}

	@Override
	@Transactional
	public Booking save(Booking booking) {
		if (booking.getBookingId() != null && booking.getBookingId() != 0) {
			booking.setPnrNo(booking.getPnrNo());
		} else {
			Random rand = new Random();
			int rand_int1 = rand.nextInt(99999);
			Long generateCode = (long) rand_int1;
			booking.setPnrNo(generateCode);
		}
		return bookingRepository.save(booking);
	}

	@Override
	public List<Booking> findBookingList() {
		List<Booking> findBookingList = bookingRepository.findAll();
		findBookingList.sort(Comparator.comparing(Booking::getBookingId, Comparator.reverseOrder()));
		return findBookingList;
	}

	@Override
	public List<Booking> findBookingByUserId(Long userId) {

		return bookingRepository.findBookingByUserId(userId);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}

}
