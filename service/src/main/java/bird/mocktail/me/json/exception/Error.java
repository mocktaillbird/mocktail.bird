package bird.mocktail.me.json.exception;


import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errorCode",
    "message",
    "developerMessage",
    "moreInfo"
})
public class Error {

    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("developerMessage")
    private String developerMessage;
    @JsonProperty("moreInfo")
    private String moreInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    public Error(String errorCode, String message, String developerMessage, String moreInfo,
			Map<String, Object> additionalProperties) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.developerMessage = developerMessage;
		this.moreInfo = moreInfo;
		this.additionalProperties = additionalProperties;
	}
    
    public Error(String errorCode, String message, String developerMessage, String moreInfo
			) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.developerMessage = developerMessage;
		this.moreInfo = moreInfo;
	}
    
    public Error(String errorCode, String message, String developerMessage
			) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.developerMessage = developerMessage;
	}
    
    
	@JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("developerMessage")
    public String getDeveloperMessage() {
        return developerMessage;
    }

    @JsonProperty("developerMessage")
    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    @JsonProperty("moreInfo")
    public String getMoreInfo() {
        return moreInfo;
    }

    @JsonProperty("moreInfo")
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
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
