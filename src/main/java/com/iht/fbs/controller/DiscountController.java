package com.iht.fbs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iht.fbs.exception.ResourceNotFoundException;
import com.iht.fbs.model.Discount;
import com.iht.fbs.service.DiscountService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/discount")
public class DiscountController {
	private static final Logger logger = LoggerFactory.getLogger(DiscountController.class);
	@Autowired
	private DiscountService discountService;

	@PostMapping("/save")
	public Discount save(@RequestBody Discount discount) {
		logger.info("save is calling : Discount " + discount);
		return discountService.save(discount);

	}

	@GetMapping(value = "/findDiscountId/{discountId}")
	public Discount findDiscountId(@PathVariable("discountId") Long discountId, HttpServletRequest req) throws ResourceNotFoundException {
		logger.info("DiscountController.findDiscountId()" + discountId);
		return discountService.findDiscountId(discountId);
	}

	@GetMapping(path = "/findDiscountList")
	public List<Discount> findDiscountList() {
		logger.info("Discount Controller.findDiscountList()");
		return discountService.findDiscountList();
	}
	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable("id") Long id) {
		logger.info(" DiscountController.deleteById()" + id);
		discountService.deleteById(id);

	}
	@GetMapping(value = "/findDiscountById/{discountId}")
	public Discount findDiscountById(@PathVariable("discountId") Long discountId, HttpServletRequest req) throws ResourceNotFoundException {
		logger.info("DiscountController.findDiscountById()" + discountId);
		return discountService.findDiscountId(discountId);
	}
}
