/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.ScheduledFlight;
import com.iht.fbs.repository.ScheduleFlightRepository;

/**
 * @author Bharat
 *
 */
@Service
@Transactional
public class ScheduleFlightServiceImpl implements ScheduleFlightService {
	@Autowired
	private ScheduleFlightRepository scheduledFlightRepository;

	@Override
	public ScheduledFlight findScheduleFlightId(Long scheduleFlightId) throws ResourceNotFoundException {

		return scheduledFlightRepository.findById(scheduleFlightId).orElseThrow(
				() -> new ResourceNotFoundException("Schdule flight not found for this id :: " + scheduleFlightId));
	}

	@Override
	public ScheduledFlight save(ScheduledFlight scheduleFlight) {

		return scheduledFlightRepository.save(scheduleFlight);
	}

	@Override
	public List<ScheduledFlight> findScheduleFlightList() {

		return scheduledFlightRepository.findAll();
	}

	@Override
	public List<ScheduledFlight> findFlightByLocation(String source, String desination) {

		return scheduledFlightRepository.findFlightByLocation(source, desination);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {

		scheduledFlightRepository.deleteById(id);
	}

}
