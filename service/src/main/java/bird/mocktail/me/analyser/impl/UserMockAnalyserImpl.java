package bird.mocktail.me.analyser.impl;

import org.springframework.stereotype.Service;

import bird.mocktail.me.analyser.UserMockAnalyser;
import bird.mocktail.me.model.Mock;
import bird.mocktail.me.pojos.UserMockResponse;

@Service
public class UserMockAnalyserImpl implements UserMockAnalyser{

	@Override
	public UserMockResponse analyseMockContentForId(Mock mock) {
		
		UserMockResponse usermock = new  UserMockResponse(mock.getId(), mock.getBody(),mock.getStatusCode(), mock.getContentType(),mock.getEncoding());
		return usermock;
	}

}
