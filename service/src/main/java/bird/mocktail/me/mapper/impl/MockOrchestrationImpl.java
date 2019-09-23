package bird.mocktail.me.mapper.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import bird.mocktail.me.analyser.UserMockAnalyser;
import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.mapper.MockOrchestration;
import bird.mocktail.me.model.Mock;
import bird.mocktail.me.repository.MockRepository;
import bird.mocktail.me.utils.MocktailBirdUtils;

@Service
public class MockOrchestrationImpl  implements MockOrchestration{
	
	private static final Logger logger = LoggerFactory.getLogger(MockOrchestrationImpl.class);

	
	@Autowired
	MockRepository mockRepository;
	
	@Autowired
	UserMockAnalyser userMockAnalyser;
	
	@Autowired
	MocktailBirdUtils mocktailBirdUtils;
	
	@Override
	@Cacheable(cacheNames = "mockid", key = "#id" )
	public UserMockResponse fetchForGivenId(String id) {
		logger.info("Start of fetchForGivenId() method, for id: {}", id);
		UserMockResponse usermockres = null;
		//Fetch data from DB
		Optional<Mock> resultMock = mockRepository.findById(id);
		if(resultMock.isPresent()) {
			Mock mock = resultMock.get();
			// Validate user mock response and pass accordingly.
			usermockres = userMockAnalyser.analyseMockContentForId(mock);
		}
		
		logger.debug("End of fetchForGivenId() method.");
		return usermockres;
	}

	@Override
	public UserMockResponse insertUserMockData(String body, String status, String contentType, String encoding, String validDays) {
		logger.debug("Start of insertUserMockData() method.");
		UserMockResponse usermockres = null;
		Date dt = new Date();
		Mock  mock =  mockRepository.save(new Mock(
						body, status, contentType , encoding, dt, dt, mocktailBirdUtils.addDays(dt,validDays) , null  
						));
		// Validate user mock response and pass accordingly.
		usermockres = userMockAnalyser.analyseMockContentForId(mock);
		return usermockres;
	}

	@Override
	public List<Mock> getAllContentOfMock() {
		logger.debug("Start of getAllContentOfMock() method.");
		List<Mock> usermockes = null;
		List<Mock>  allMock =  mockRepository.findAll();
		return allMock;
	}


}
