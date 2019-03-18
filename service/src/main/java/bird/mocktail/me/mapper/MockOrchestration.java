package bird.mocktail.me.mapper;

import bird.mocktail.me.json.UserMockResponse;

public interface MockOrchestration {
	
	public UserMockResponse fetchForGivenId(String id);
	
	public UserMockResponse insertUserMockData(String body, String status, String contentType, String encoding);

}
