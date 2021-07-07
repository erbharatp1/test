/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Discount;


/**
 * @author Bharat
 *
 */

public interface DiscountService {

	public Discount findDiscountId(Long discountId) throws ResourceNotFoundException;

	public Discount save(Discount ScheduleFlight);

	public List<Discount> findDiscountList();

	public void deleteById(Long id);

	 


}
