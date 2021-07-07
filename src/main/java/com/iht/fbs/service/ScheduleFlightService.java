/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.ScheduledFlight;


/**
 * @author Bharat
 *
 */

public interface ScheduleFlightService {

	public ScheduledFlight findScheduleFlightId(Long ScheduleFlightId) throws ResourceNotFoundException;

	public ScheduledFlight save(ScheduledFlight ScheduleFlight);

	public List<ScheduledFlight> findScheduleFlightList();

	public List<ScheduledFlight> findFlightByLocation(String source,String desination);

	public void deleteById(Long id);


}
