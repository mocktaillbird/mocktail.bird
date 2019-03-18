package bird.mocktail.me.json;

public class UserMockResponse {
	
	private String url;
	
	private String id;

	private String body;

	private String statusCode;
	
	private String contentType;
	
	private String encoding;
	
	
	
	public UserMockResponse(String id, String body, String statusCode, String contentType, String encoding) {
		this.id = id;
		this.body = body;
		this.statusCode = statusCode;
		this.contentType = contentType;
		this.encoding = encoding;
	}
	
	public UserMockResponse(String body, String statusCode, String contentType, String encoding) {
		this.body = body;
		this.statusCode = statusCode;
		this.contentType = contentType;
		this.encoding = encoding;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
