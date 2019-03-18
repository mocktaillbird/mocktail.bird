package bird.mocktail.me.constants;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import bird.mocktail.me.pojos.StatusCodeMapping;

public class StatusCodes {
	
	private StatusCodes() {
		
	}
	
	public static final Map<String, StatusCodeMapping> mapper = new HashMap<String, StatusCodeMapping>() {{
		put("100 Continue" ,new StatusCodeMapping(100, "100 Continue", HttpStatus.CONTINUE));
		put("101 Switching Protocol" ,new StatusCodeMapping(101, "101 Switching Protocol", HttpStatus.SWITCHING_PROTOCOLS));
		put("102 Processing" ,new StatusCodeMapping(102, "102 Processing", HttpStatus.PROCESSING));
		put("200 OK" ,new StatusCodeMapping(200, "200 OK", HttpStatus.OK));
		put("201 Created" ,new StatusCodeMapping(201, "201 Created", HttpStatus.CREATED));
		put("202 Accepted" ,new StatusCodeMapping(202, "202 Accepted", HttpStatus.ACCEPTED));
		put("203 Non-authoritative Information" ,new StatusCodeMapping(203, "203 Non-authoritative Information", HttpStatus.NON_AUTHORITATIVE_INFORMATION));
		put("204 No Content" ,new StatusCodeMapping(204, "204 No Content", HttpStatus.NO_CONTENT));
		put("205 Reset Content" ,new StatusCodeMapping(205, "205 Reset Content", HttpStatus.RESET_CONTENT));
		put("206 Partial Content" ,new StatusCodeMapping(206, "206 Partial Content", HttpStatus.PARTIAL_CONTENT));
		put("207 Multi-Status" ,new StatusCodeMapping(207, "207 Multi-Status", HttpStatus.MULTI_STATUS));
		put("208 Already Reported" ,new StatusCodeMapping(208, "208 Already Reported", HttpStatus.ALREADY_REPORTED));
		put("226 IM Used" ,new StatusCodeMapping(226, "226 IM Used", HttpStatus.IM_USED));
		put("300 Multiple Choices" ,new StatusCodeMapping(300, "300 Multiple Choices", HttpStatus.MULTIPLE_CHOICES));
		put("301 Moved Permanently" ,new StatusCodeMapping(301, "301 Moved Permanently", HttpStatus.MOVED_PERMANENTLY));
		put("302 Found" ,new StatusCodeMapping(302, "302 Found", HttpStatus.FOUND));
		put("303 See Other" ,new StatusCodeMapping(303, "303 See Other", HttpStatus.SEE_OTHER));
		put("304 Not Modified" ,new StatusCodeMapping(304, "304 Not Modified", HttpStatus.NOT_MODIFIED));
		put("305 Use Proxy" ,new StatusCodeMapping(305, "305 Use Proxy", HttpStatus.USE_PROXY));
		put("307 Temporary Redirect" ,new StatusCodeMapping(307, "307 Temporary Redirect", HttpStatus.TEMPORARY_REDIRECT));
		put("308 Permanent Redirect" ,new StatusCodeMapping(308, "308 Permanent Redirect", HttpStatus.PERMANENT_REDIRECT));
		put("400 Bad Request" ,new StatusCodeMapping(400, "400 Bad Request", HttpStatus.BAD_REQUEST));
		put("401 Unauthorized" ,new StatusCodeMapping(401, "401 Unauthorized", HttpStatus.UNAUTHORIZED));
		put("402 Payment Required" ,new StatusCodeMapping(402, "402 Payment Required", HttpStatus.PAYMENT_REQUIRED));
		put("403 Forbidden" ,new StatusCodeMapping(403, "403 Forbidden", HttpStatus.FORBIDDEN));
		put("404 Not Found" ,new StatusCodeMapping(404, "404 Not Found", HttpStatus.NOT_FOUND));
		put("405 Method Not Allowed" ,new StatusCodeMapping(405, "405 Method Not Allowed", HttpStatus.METHOD_NOT_ALLOWED));
		put("406 Not Acceptable" ,new StatusCodeMapping(406, "406 Not Acceptable", HttpStatus.NOT_ACCEPTABLE));
		put("407 Proxy Authentication Required" ,new StatusCodeMapping(407, "407 Proxy Authentication Required", HttpStatus.PROXY_AUTHENTICATION_REQUIRED));
		put("408 Request Timeout" ,new StatusCodeMapping(408, "408 Request Timeout", HttpStatus.REQUEST_TIMEOUT));
		put("409 Conflict" ,new StatusCodeMapping(409, "409 Conflict", HttpStatus.CONFLICT));
		put("410 Gone" ,new StatusCodeMapping(410, "410 Gone", HttpStatus.GONE));
		put("411 Length Required" ,new StatusCodeMapping(411, "411 Length Required", HttpStatus.LENGTH_REQUIRED));
		put("412 Precondition Failed" ,new StatusCodeMapping(412, "412 Precondition Failed", HttpStatus.PRECONDITION_FAILED));
		put("413 Payload Too Large" ,new StatusCodeMapping(413, "413 Payload Too Large", HttpStatus.PAYLOAD_TOO_LARGE));
		put("414 Request-URI Too Long" ,new StatusCodeMapping(414, "414 Request-URI Too Long", HttpStatus.REQUEST_URI_TOO_LONG));
		put("415 Unsupported Media Type" ,new StatusCodeMapping(415, "415 Unsupported Media Type", HttpStatus.UNSUPPORTED_MEDIA_TYPE));
		put("416 Requested Range Not Satisfiable" ,new StatusCodeMapping(416, "416 Requested Range Not Satisfiable", HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE));
		put("417 Expectation Failed" ,new StatusCodeMapping(417, "417 Expectation Failed", HttpStatus.EXPECTATION_FAILED));
		put("418 I'm a teapot" ,new StatusCodeMapping(418, "418 I'm a teapot", HttpStatus.I_AM_A_TEAPOT));
		put("421 Destination Locked" ,new StatusCodeMapping(421, "421 Destination Locked", HttpStatus.DESTINATION_LOCKED));
		put("422 Unprocessable Entity" ,new StatusCodeMapping(422, "422 Unprocessable Entity", HttpStatus.UNPROCESSABLE_ENTITY));
		put("423 Locked" ,new StatusCodeMapping(423, "423 Locked", HttpStatus.LOCKED));
		put("424 Failed Dependency" ,new StatusCodeMapping(424, "424 Failed Dependency", HttpStatus.FAILED_DEPENDENCY));
		put("426 Upgrade Required" ,new StatusCodeMapping(426, "426 Upgrade Required", HttpStatus.UPGRADE_REQUIRED));
		put("428 Precondition Required" ,new StatusCodeMapping(428, "428 Precondition Required", HttpStatus.PRECONDITION_REQUIRED));
		put("429 Too Many Requests" ,new StatusCodeMapping(429, "429 Too Many Requests", HttpStatus.TOO_MANY_REQUESTS));
		put("431 Request Header Fields Too Large" ,new StatusCodeMapping(431, "431 Request Header Fields Too Large", HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE));
		put("451 Unavailable For Legal Reasons" ,new StatusCodeMapping(451, "451 Unavailable For Legal Reasons", HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS));
		put("500 Internal Server Error" ,new StatusCodeMapping(500, "500 Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR));
		put("501 Not Implemented" ,new StatusCodeMapping(501, "501 Not Implemented", HttpStatus.NOT_IMPLEMENTED));
		put("502 Bad Gateway" ,new StatusCodeMapping(502, "502 Bad Gateway", HttpStatus.BAD_GATEWAY));
		put("503 Service Unavailable" ,new StatusCodeMapping(503, "503 Service Unavailable", HttpStatus.SERVICE_UNAVAILABLE));
		put("504 Gateway Timeout" ,new StatusCodeMapping(504, "504 Gateway Timeout", HttpStatus.GATEWAY_TIMEOUT));
		put("505 HTTP Version Not Supported" ,new StatusCodeMapping(505, "505 HTTP Version Not Supported", HttpStatus.HTTP_VERSION_NOT_SUPPORTED));
		put("506 Variant Also Negotiates" ,new StatusCodeMapping(506, "506 Variant Also Negotiates", HttpStatus.VARIANT_ALSO_NEGOTIATES));
		put("507 Insufficient Storage" ,new StatusCodeMapping(507, "507 Insufficient Storage", HttpStatus.INSUFFICIENT_STORAGE));
		put("508 Loop Detected" ,new StatusCodeMapping(508, "508 Loop Detected", HttpStatus.LOOP_DETECTED));
		put("510 Not Extended" ,new StatusCodeMapping(510, "510 Not Extended", HttpStatus.NOT_EXTENDED));
		put("511 Network Authentication Required" ,new StatusCodeMapping(511, "511 Network Authentication Required", HttpStatus.NETWORK_AUTHENTICATION_REQUIRED));

	}};
	
	

}
