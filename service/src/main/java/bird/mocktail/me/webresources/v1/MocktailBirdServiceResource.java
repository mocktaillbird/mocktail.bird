package bird.mocktail.me.webresources.v1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MocktailBirdServiceResource {
	
	@GetMapping(path= "/")
	public String welcome() {
		return "Hello, Welocme to Mocktail.bird !";
	}
	
	
	@GetMapping(path = "/api/{id}")
	public String getMockResources(@PathVariable("id") String id) {
		return "Under development.";
	}

}
