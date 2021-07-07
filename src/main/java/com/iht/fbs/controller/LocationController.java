package com.iht.fbs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iht.fbs.model.Location;
import com.iht.fbs.service.LocationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/location")
public class LocationController {
	private static final Logger logger = LoggerFactory.getLogger(LocationController.class);
	@Autowired
	private LocationService locationService;
	
	@GetMapping(path = "/findLocationList")
	public List<Location> findLocationList() {
		logger.info("LocationController.findLocationList()");
		return locationService.findLocationList();
	}
 
}
