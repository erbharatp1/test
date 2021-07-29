package com.iht.fbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * 
 * @author Bharat
 *
 */
@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class FlightBookingSystemApplication {
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingSystemApplication.class, args);
	}

//	@Bean
//	public VelocityEngine getVelocityEngine() throws VelocityException, IOException {
//		VelocityEngineFactory velocityEngineFactory = new VelocityEngineFactory();
//		Properties props = new Properties();
//		props.put("resource.loader", "class");
//		props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
//
//		velocityEngineFactory.setVelocityProperties(props);
//		return velocityEngineFactory.createVelocityEngine();
//	}
}
