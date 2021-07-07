/**
 * 
 */
package com.iht.fbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iht.fbs.model.Discount;

/**
 * @author Bharat
 *
 */
@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

	

}
