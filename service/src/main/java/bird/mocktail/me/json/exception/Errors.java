package bird.mocktail.me.json.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error"
})
public class Errors {

    @JsonProperty("error")
    private List<Error> error ;
        
   	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
   	
 
    public Errors(List<Error> error) {
		super();
		this.error = error;
	}
    
    public Errors(Error errora) {
		super();
		 error = Arrays.asList(errora);
	}
    
    public Errors() {
		super();
		this.error = new ArrayList<Error>();
	}
    
	@JsonProperty("error")
    public List<Error> getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(List<Error> error) {
        this.error = error;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
