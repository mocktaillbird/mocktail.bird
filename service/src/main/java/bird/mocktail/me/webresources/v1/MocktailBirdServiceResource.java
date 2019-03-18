package bird.mocktail.me.webresources.v1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bird.mocktail.me.constants.ErrorCodes;
import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.mapper.MockOrchestration;
import bird.mocktail.me.utils.MocktailBirdUtils;

@RestController
public class MocktailBirdServiceResource {
	
	private static final Logger logger = LoggerFactory.getLogger(MocktailBirdServiceResource.class);


	@Autowired
	MocktailBirdUtils mocktailBirdUtils;
	
	@Autowired
	MockOrchestration mockOrche;
	
	@Value("${server.port}")
	String port;
	
	@Value("${mocktail.bird.hostname}")
	String hostname;
	
	@GetMapping(path= "/")
	public String welcome() {
		return "Hello, Welocme to Mocktail.bird !";
	}
	
	
	@GetMapping(path = "/api/{id}", produces="application/json")
	public ResponseEntity<?> getMockResources(@PathVariable("id") String id) {
		
		logger.info("Started getMockResources() for id: {}", id);
		
		// validate Input
		boolean validId = mocktailBirdUtils.isValidateURLId(id);
		if(!validId) {
			logger.error("{} , {}",ErrorCodes.INVALID_ID.getKey() , ErrorCodes.INVALID_ID.getValue() );
			return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
		}
		
		//orchestration  layer
		UserMockResponse usermockresp = mockOrche.fetchForGivenId(id);
		
		if(null != usermockresp && null != mocktailBirdUtils.sendCorrectStatus(usermockresp)) {
			return new ResponseEntity<>(usermockresp.getBody(),  mocktailBirdUtils.sendCorrectStatus(usermockresp));
		}else {
			logger.error("{} , {}",ErrorCodes.INVALID_REQUEST.getKey() , ErrorCodes.INVALID_REQUEST.getValue() );
			return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PostMapping(path = "/api/createmock", produces="application/json")
	public ResponseEntity<?> createNewMockResources(@RequestParam(name = "_status", defaultValue = "200 OK" ) String status, 
													@RequestParam(name = "_contentType", defaultValue = "application/json" ) String contentType,
													@RequestParam(name = "_encode", defaultValue = "UTF-8") String encoding,
													@RequestBody(required= false) String body) {
		
		logger.info("Started createNewMockResources()");
		// validate Input
		
		//orchestration  layer
		UserMockResponse usermockresp = mockOrche.insertUserMockData(body, status, contentType, encoding);
		
		usermockresp.setUrl(hostname+":"+port+"/api/"+usermockresp.getId());
		
		return new ResponseEntity<>(usermockresp,  HttpStatus.CREATED);
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
