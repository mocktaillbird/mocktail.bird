package bird.mocktail.me.webresources.v1;


import java.util.Optional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bird.mocktail.me.dto.MockResponseBody;
import bird.mocktail.me.model.Mock;
import bird.mocktail.me.repository.MockRepository;

@RestController
public class MocktailBirdServiceResource {
	
	private static final Logger logger = LoggerFactory.getLogger(MocktailBirdServiceResource.class);

	
	@Autowired
	MockRepository mockRepository;
	
	
	@GetMapping(path= "/")
	public String welcome() {
		return "Hello, Welocme to Mocktail.bird !";
	}
	
	
	@GetMapping(path = "/api/{id}")
	public ResponseEntity<?> getMockResources(@PathVariable("id") String id) {
		String body = "{}";
		Optional<Mock> resultMock = mockRepository.findById(id);
		if(resultMock.isPresent()) {
			Mock mock = resultMock.get();
			body = mock.getBody();
		}
		logger.debug("Mock body for Id : {} is \n {}",id,body);
		//logger.debug("---- {}",new JSONObject(body).toString());
		return new ResponseEntity<JSONObject>(new JSONObject(body), HttpStatus.OK);
	}

}
