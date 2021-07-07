/**
 * 
 */
package com.iht.fbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Discount;
import com.iht.fbs.repository.DiscountRepository;

/**
 * @author Bharat
 *
 */
@Service
@Transactional
public class DiscountServiceImpl implements DiscountService {
	@Autowired
	private DiscountRepository discountRepository;

	@Override
	public Discount findDiscountId(Long discountId) throws ResourceNotFoundException {

		return discountRepository.findById(discountId)
				.orElseThrow(() -> new ResourceNotFoundException("Discount not found for this id :: " + discountId));
	}

	@Override
	public Discount save(Discount dis) {

		return discountRepository.save(dis);
	}

	@Override
	public List<Discount> findDiscountList() {

		return discountRepository.findAll();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		discountRepository.deleteById(id);
	}

}
