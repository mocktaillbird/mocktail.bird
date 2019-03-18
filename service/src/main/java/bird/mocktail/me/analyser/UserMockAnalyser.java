package bird.mocktail.me.analyser;

import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.model.Mock;

public interface UserMockAnalyser{
	
	public UserMockResponse analyseMockContentForId(Mock mock);
	
	

}
