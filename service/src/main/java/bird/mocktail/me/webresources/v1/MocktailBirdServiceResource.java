package bird.mocktail.me.webresources.v1;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bird.mocktail.me.constants.ErrorCodes;
import bird.mocktail.me.mapper.MockOrchestration;
import bird.mocktail.me.mapper.impl.MockOrchestrationImpl;
import bird.mocktail.me.model.Mock;
import bird.mocktail.me.repository.MockRepository;
import bird.mocktail.me.utils.MocktailBirdUtils;

@RestController
public class MocktailBirdServiceResource {
	
	private static final Logger logger = LoggerFactory.getLogger(MocktailBirdServiceResource.class);


	@Autowired
	MocktailBirdUtils mocktailBirdUtils;
	
	@Autowired
	MockOrchestration mockOrche;
	
	@GetMapping(path= "/")
	public String welcome() {
		return "Hello, Welocme to Mocktail.bird !";
	}
	
	
	@GetMapping(path = "/api/{id}", produces="application/json")
	public ResponseEntity<?> getMockResources(@PathVariable("id") String id) {
		
		logger.info("Started getMockResources() for id: {}", id);
		
		String body = "";
	
		// validate Input
		boolean validId = mocktailBirdUtils.isValidateURLId(id);
		if(!validId) {
			logger.error("{} , {}",ErrorCodes.IN_VALID_ID.getKey() , ErrorCodes.IN_VALID_ID.getValue() );
			return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
		}
		
		
		//orchestration  layer
		mockOrche.fetchForGivenId(id);
		
		logger.info("End of getMockResources()");
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
	
	/*
	 * input param check or validation
	 * create an orchestration layer
	 * cache implementation
	 * fetch from db
	 * process data from db
	 * send the body as per the response
	 * 
	 */

}
