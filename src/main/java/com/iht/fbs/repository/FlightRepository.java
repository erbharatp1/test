/**
 * 
 */
package com.iht.fbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iht.fbs.model.Flight;

/**
 * @author Bharat
 *
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
	public static final String DELETE_BY_FLIGHT_ID = "DELETE FROM Flight WHERE id = ?1";
	public static final String UPDATE_BY_ID = "Update Flight el SET el.activeStatus =:activeStatus WHERE el.id=:id";
	public static final String FIND_FLIGHT_BY_SOURCE = "SELECT fl.id,fl.carrier_name,  sf.source_airport,sf.destination, sf.departure, fl.price, sf.departure_time  FROM fly_db.flight fl left join fly_db.scheduled_flight sf on fl.id = sf.flight_id where sf.source_airport=?1 and sf.destination=?2 and sf.departure  between ?3  and '2021-10-12'  ";

	@Query(value = FIND_FLIGHT_BY_SOURCE, nativeQuery = true)
	public List<Object[]> findFlightBySource(String source, String destnation, String departure);

	@Modifying
	@Query(value = DELETE_BY_FLIGHT_ID, nativeQuery = true)
	void deleteByFlightID(Long id);
	
	@Modifying
	@Query(value = UPDATE_BY_ID)
	void updateById(@Param("id") Long id, @Param("activeStatus") String activeStatus);

}
