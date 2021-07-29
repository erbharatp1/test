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

@SpringBootTest(classes = FlightBookingSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
 class FlightControllerApplicationTests {

	
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	 void testFindFlightList() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/flight/findFlightList", HttpMethod.GET,
				entity, String.class);
		assertNotNull(response.getBody());
	}

//	@Test
//	void shouldGetAllMovies() {
//		List<Flight> dummyMovies = Stream.of(new Flight(1, 1452, "Air", "AZSX@##", 142, 11, "AC", 1, 1, new Date()))
//				.collect(Collectors.toList());
//		Mockito.when(repo.findAll()).thenReturn(dummyMovies);
//
//		List<Flight> movies = service.findFlightList();
//		Assert.assertEquals(dummyMovies, movies);
//	}

}