/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import com.iht.fbs.dto.FlightDTO;
import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Flight;

/**
 * @author Bharat
 *
 */

public interface FlightService {

	public Flight save(Flight user);

	public List<Flight> findFlightList();

	public Flight findFlightId(Long flightId) throws ResourceNotFoundException;

	public void deleteById(Long id);

	public List<FlightDTO> findFlightBySource(String source, String destnation, String currentDate);

	public void updateById(Long id, String activeStatus);
}
