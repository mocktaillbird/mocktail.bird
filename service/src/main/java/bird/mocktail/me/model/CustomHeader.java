package bird.mocktail.me.model;

import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomHeader {
	
	Map<String, String> headers;
	
	

}
