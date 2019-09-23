package bird.mocktail.me.mapper;

import java.util.List;

import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.model.Mock;

public interface MockOrchestration {
	
	public UserMockResponse fetchForGivenId(String id);
	
	public UserMockResponse insertUserMockData(String body, String status, String contentType, String encoding, String validDays);
	
	public List<Mock> getAllContentOfMock();

}
