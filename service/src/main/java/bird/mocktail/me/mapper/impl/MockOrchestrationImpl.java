package bird.mocktail.me.mapper.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bird.mocktail.me.mapper.MockOrchestration;
import bird.mocktail.me.model.Mock;
import bird.mocktail.me.repository.MockRepository;

@Service
public class MockOrchestrationImpl  implements MockOrchestration{
	
	private static final Logger logger = LoggerFactory.getLogger(MockOrchestrationImpl.class);

	
	@Autowired
	MockRepository mockRepository;
	
	@Override
	public void fetchForGivenId(String id) {
		logger.debug("Start of fetchForGivenId() method.");
		
		//Fetch data from DB
		Optional<Mock> resultMock = mockRepository.findById(id);
		if(resultMock.isPresent()) {
			Mock mock = resultMock.get();
		}
		
		// Validate user mock response and pass accordingly
		
		//logger.debug("Mock body for Id : {} is \n {}",id,"");
		logger.debug("End of fetchForGivenId() method.");
	}

}
