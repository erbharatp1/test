/**
 * 
 */
package com.iht.fbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iht.fbs.model.Passengers;

/**
 * @author Bharat
 *
 */
@Repository
public interface PassengersRepository extends JpaRepository<Passengers, Long> {

	 
}
