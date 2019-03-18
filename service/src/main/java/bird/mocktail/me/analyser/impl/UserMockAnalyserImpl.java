package bird.mocktail.me.analyser.impl;

import org.springframework.stereotype.Service;

import bird.mocktail.me.analyser.UserMockAnalyser;
import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.model.Mock;

@Service
public class UserMockAnalyserImpl implements UserMockAnalyser{

	@Override
	public UserMockResponse analyseMockContentForId(Mock mock) {
		
		return new  UserMockResponse(mock.getId(), 
				mock.getBody(),
				mock.getStatusCode(), 
				mock.getContentType(),
				mock.getEncoding());
	}

}
