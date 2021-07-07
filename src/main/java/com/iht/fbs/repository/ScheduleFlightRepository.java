/**
 * 
 */
package com.iht.fbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iht.fbs.model.ScheduledFlight;

/**
 * @author Bharat
 *
 */
@Repository
public interface ScheduleFlightRepository extends JpaRepository<ScheduledFlight, Long> {

	public static final String DELETE_BY_SCHEDULED_FLIGHT_ID = "DELETE FROM scheduled_flight WHERE scheduleFlightId = ?1";

	@Modifying
	@Query(value = DELETE_BY_SCHEDULED_FLIGHT_ID, nativeQuery = true)
	void deleteByFlightID(Long id);

	@Query(value = "SELECT * FROM scheduled_flight sc where sc.source_airport=?1 and sc.destination=?2  ORDER BY schedule_flight_id;", nativeQuery = true)
	public List<ScheduledFlight> findFlightByLocation(String source, String desination);

}
