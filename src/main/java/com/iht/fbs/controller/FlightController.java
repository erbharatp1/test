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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iht.fbs.dto.FlightDTO;
import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Flight;
import com.iht.fbs.service.FlightService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/flight")
public class FlightController {
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);
	@Autowired
	private FlightService flightService;

	@PostMapping(path = "/save")
	public Flight save(@RequestBody Flight user, HttpServletRequest req) {
		logger.info("save is calling : User " + user);

		return flightService.save(user);

	}

	@GetMapping(value = "/findFlightById/{flightId}")
	public Flight findFlightById(@PathVariable("flightId") Long flightId, HttpServletRequest req)
			throws ResourceNotFoundException {
		logger.info("FlightController.findFlightById()" + flightId);
		return flightService.findFlightId(flightId);
	}

	@GetMapping(path = "/findFlightList")
	public List<Flight> findFlightList() {
		logger.info("FlightController.findFlightList()");

		return flightService.findFlightList();
	}

	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable("id") Long id) {
		logger.info("deleteById()" + id);
		flightService.deleteById(id);

	}

	@GetMapping(path = "/findFlightBySource/{source}/{destnation}/{departure}")
	public List<FlightDTO> findFlightBySource(@PathVariable("source") String source,
			@PathVariable("destnation") String destnation, @PathVariable("departure") String departure,
			HttpServletRequest req) {

		logger.info("FlightController.findFlightBySource()");
		return flightService.findFlightBySource(source, destnation, departure);

	}

	@PutMapping(path = "/flightStatusUpdate")
	public void flightStatusUpdate(@RequestBody Flight flight, HttpServletRequest req) {
		logger.info("save flightStatusUpdate is calling :  " + flight);
		flightService.updateById(flight.getId(), flight.getActiveStatus());

	}

}
