/**
 * 
 */
package com.iht.fbs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iht.fbs.dto.FlightDTO;
import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Flight;
import com.iht.fbs.repository.FlightRepository;

/**
 * @author Bharat
 *
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepository repo;
	@Autowired
	KafkaProducer kafkaProducer;

	public static final String topic = "airline_topic";

	@Override
	public Flight save(Flight flight) {
		//kafkaProducer.sendAirlineMessage(flight);
		return repo.save(flight);
	}

	@Override
	// @Cacheable(cacheNames = "flightCache")
	public List<Flight> findFlightList() {
		return repo.findAll();
	}

	@Override
	public Flight findFlightId(Long flightId) throws ResourceNotFoundException {
		Flight flight = repo.findById(flightId)
				.orElseThrow(() -> new ResourceNotFoundException("Flight not found for this id :: " + flightId));
		return flight;

	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repo.deleteByFlightID(id);
	}

	@Override
	public List<FlightDTO> findFlightBySource(String source, String destnation, String departure) {
		List<Object[]> list = repo.findFlightBySource(source, destnation, departure);
		List<FlightDTO> levelPositionList = new ArrayList<>();
		for (Object[] obj : list) {
			FlightDTO flightDto = new FlightDTO();
			Long flightId = obj[0] != null ? Long.parseLong(obj[0].toString()) : null;
			String carrierName = obj[1] != null ? (String) obj[1] : null;
			String sourceAirport = obj[2] != null ? (String) obj[2] : null;
			String destination = obj[3] != null ? (String) obj[3] : null;
			Date departure1 = obj[4] != null ? (Date) obj[4] : null;
			Long price = obj[5] != null ? Long.parseLong(obj[5].toString()) : null;

			String departureTime = obj[6] != null ? (String) obj[6] : null;
			flightDto.setId(flightId);
			flightDto.setCarrierName(carrierName);
			flightDto.setPrice(price);
			flightDto.setSourceAirport(sourceAirport);
			flightDto.setDeparture(departure1);
			flightDto.setDepartureTime(departureTime);
			flightDto.setDestination(destination);
			levelPositionList.add(flightDto);
		}
		return levelPositionList;

	}

	@Override
	// @Transactional
	public void updateById(Long id, String activeStatus) {
		repo.updateById(id, activeStatus);

	}

//	@KafkaListener(topics = "techgeeknext-topic", groupId = "techgeeknext-group")
//    public void listen(Flight flight) {
//		repo.save(flight);
//        System.out.println("Received User information : " + flight);
//    }

}
