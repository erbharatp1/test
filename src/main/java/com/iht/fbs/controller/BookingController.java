package com.iht.fbs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Booking;
import com.iht.fbs.service.BookingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/booking")
public class BookingController {
	private static final Logger logger = LoggerFactory.getLogger(BookingController.class);
 
	@Autowired
	private BookingService bookingService;

	@PostMapping(path = "/save")
	public void save(@RequestBody Booking booking) {
		logger.info("save is calling : Booking {,}" + booking);

		Booking book = bookingService.save(booking);

		logger.info("BookingController {,}" + book);

	}

	@GetMapping(value = "/findBookingById/{bookingId}")
	public Booking findBookingById(@PathVariable("bookingId") Long bookingId) throws ResourceNotFoundException {
		logger.info("BookingController.findBookingById()", bookingId);
		return bookingService.findBookingId(bookingId);
	}

	@GetMapping(path = "/findBookingList")
	public List<Booking> findBookingList() {
		logger.info("BookingController.findBookingList()");
		return bookingService.findBookingList();
	}

	@GetMapping(path = "/findBookingByUserId/{userId}")
	public List<Booking> findBookingByUserId(@PathVariable("userId") Long userId, HttpServletRequest req) {
		logger.info("BookingController.findBookingByUserId()" + userId);
		return bookingService.findBookingByUserId(userId);
	}

	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable("id") Long id) {
		logger.info("deleteById()" + id);
		bookingService.deleteById(id);

	}

}
