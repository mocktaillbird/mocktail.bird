package bird.mocktail.me.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Document(collection = "mock")
public class Mock {
	
//	"_id" : ObjectId("5c82f780a6a0301753834666"),
//	"expireAt" : ISODate("2019-03-13T22:15:09.807Z"),
//	"body" : "{"cdccd":"jaffa"},
//	"status_code" : "200 OK",
//	"content_type" : "application/json",
//	"encoding" : "UTF-8",
//	"createdTime" : ISODate("2019-03-08T18:17:50.079Z"),
//	"modifiedTime" : ISODate("2019-03-08T18:17:50.079Z"),
//	"custom_headers" : {
//		"key1" : "value1",
//		"key2" : "value2",
//	}
	
	@Id
	private String id;
	
	private String body;
	
	@Field("status_code")
	private String statusCode;
	
	@Field("content_type")
	private String contentType;
	
	private String encoding;
	
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private java.util.Date createdTime;
	
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private java.util.Date modifiedTime;
	
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private java.util.Date expireAt;
	
	@Field("custom_headers")
	private Map<String, String> customheaders;
	
	
	public Mock() {
		super();
	}

	public Mock(String id, String body, String statusCode, String contentType, String encoding, Date createdTime,
			Date modifiedTime, Date expireAt, Map<String, String> customheaders) {
		super();
		this.id = id;
		this.body = body;
		this.statusCode = statusCode;
		this.contentType = contentType;
		this.encoding = encoding;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.expireAt = expireAt;
		this.customheaders = customheaders;
	}
	
	public Mock(String body, String statusCode, String contentType, String encoding, Date createdTime,
			Date modifiedTime, Date expireAt, Map<String, String> customheaders) {
		super();
		this.body = body;
		this.statusCode = statusCode;
		this.contentType = contentType;
		this.encoding = encoding;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.expireAt = expireAt;
		this.customheaders = customheaders;
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

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public java.util.Date getExpireAt() {
		return expireAt;
	}

	public void setExpireAt(java.util.Date expireAt) {
		this.expireAt = expireAt;
	}

	public Map<String, String> getCustomheaders() {
		return customheaders;
	}

	public void setCustomheaders(Map<String, String> customheaders) {
		this.customheaders = customheaders;
	}

	

	
	
}
