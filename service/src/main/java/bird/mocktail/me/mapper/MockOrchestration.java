package bird.mocktail.me.mapper;

import bird.mocktail.me.pojos.UserMockResponse;

public interface MockOrchestration {
	
	public UserMockResponse fetchForGivenId(String id);

}
