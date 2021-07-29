package com.iht.fbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.iht.fbs.model.Location;
import com.iht.fbs.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository repository;

	@Override
	@Cacheable(cacheNames = "locationCache")
	public List<Location> findLocationList() {
		return repository.findAll();

	}

}
