package bird.mocktail.me.analyser;

import bird.mocktail.me.model.Mock;
import bird.mocktail.me.pojos.UserMockResponse;

public interface UserMockAnalyser{
	
	public UserMockResponse analyseMockContentForId(Mock mock);
	
	

}
