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
import com.iht.fbs.model.ScheduledFlight;
import com.iht.fbs.service.ScheduleFlightService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/scheduledFlight")
public class ScheduleFlightController {
	private static final Logger logger = LoggerFactory.getLogger(ScheduleFlightController.class);
	@Autowired
	private ScheduleFlightService scheduleFlightService;

	@PostMapping("/save")
	public ScheduledFlight save(@RequestBody ScheduledFlight scheduledFlight, HttpServletRequest req) {
		logger.info("save is calling : ScheduledFlight " + scheduledFlight);
		return scheduleFlightService.save(scheduledFlight);

	}

	@GetMapping(value = "/findScheduledFlightById/{scheduledFlightId}")
	public ScheduledFlight findScheduledFlightById(@PathVariable("scheduledFlightId") Long scheduledFlightId,
			HttpServletRequest req) throws ResourceNotFoundException {
		logger.info("ScheduledFlightController.findScheduledFlightById()" + scheduledFlightId);
		return scheduleFlightService.findScheduleFlightId(scheduledFlightId);
	}

	@GetMapping(path = "/findScheduledFlightList")
	public List<ScheduledFlight> findScheduledFlightList() {
		logger.info("ScheduledFlightController.findScheduledFlightList()");
		return scheduleFlightService.findScheduleFlightList();
	}

	@GetMapping(path = "/findFlightByLocation/{source}/{desination}")
	public List<ScheduledFlight> findFlightByLocation(@PathVariable("source") String source,
			@PathVariable("desination") String desination) {
		logger.info("ScheduledFlightController.findFlightByLocation()");
		return scheduleFlightService.findFlightByLocation(source, desination);
	}
	
	
	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable("id") Long id) {
		logger.info("deleteById()" + id);
		scheduleFlightService.deleteById(id);
		 
	}
}
