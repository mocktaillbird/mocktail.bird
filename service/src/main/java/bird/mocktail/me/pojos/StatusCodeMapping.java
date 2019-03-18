package bird.mocktail.me.pojos;

import org.springframework.http.HttpStatus;

public class StatusCodeMapping {
	
	Integer id;
	String status;
	HttpStatus httpStatus;
	
	
	public StatusCodeMapping(Integer id, String status, HttpStatus httpStatus) {
		super();
		this.id = id;
		this.status = status;
		this.httpStatus = httpStatus;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	
}
