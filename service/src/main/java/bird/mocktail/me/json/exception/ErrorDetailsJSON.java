package bird.mocktail.me.json.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errors"
})
public class ErrorDetailsJSON {
	
	@Autowired
    @JsonProperty("errors")
    private Errors errors;

    @JsonProperty("errors")
    public Errors getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

}
