package com.iht.fbs.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.iht.fbs.FlightBookingSystemApplication;
import com.iht.fbs.model.Discount;
import com.iht.fbs.repository.DiscountRepository;
import com.iht.fbs.service.DiscountService;

@SpringBootTest(classes = FlightBookingSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DiscountControllerApplicationTests {

	@Autowired
	DiscountService service;
	@Autowired
	DiscountRepository repo;

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	 
	@Test
	void testFindDiscountList() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/discount/findDiscountList",
				HttpMethod.GET, entity, String.class);
		assertNotNull(response.getBody());
	}

}
