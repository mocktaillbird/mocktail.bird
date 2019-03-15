package bird.mocktail.me.constants;

import java.util.HashMap;
import java.util.Map;

public class StatusCodes {
	
	public static  Map<String, Integer> get = new HashMap<>();
	static {
		get.put("100 Continue" , 100);
		get.put("101 Switching Protocols", 101);
		get.put("102 Processing", 102);
		get.put("200 OK" , 200);
		get.put("201 Created", 201);
		get.put("202 Accepted", 202);
		get.put("203 Non-authoritative Information", 203);
		get.put("204 No Content", 204);
		get.put("205 Reset Content", 205);
		get.put("206 Partial Content", 206);
		get.put("207 Multi-Status", 207);
		get.put("208 Already Reported", 208);
		get.put("226 IM Used", 226);
		get.put("300 Multiple Choices", 300);
		get.put("301 Moved Permanently", 301);
		get.put("302 Found", 302);
		get.put("303 See Other", 303);
		get.put("304 Not Modified", 304);
		get.put("305 Use Proxy", 305);
		get.put("307 Temporary Redirect", 307);
		get.put("308 Permanent Redirect", 308);
		get.put("400 Bad Request", 400);
		get.put("401 Unauthorized", 401);
		get.put("402 Payment Required", 402);
		get.put("403 Forbidden", 403);
		get.put("404 Not Found", 404);
		get.put("405 Method Not Allowed", 405);
		get.put("406 Not Acceptable", 406);
		get.put("407 Proxy Authentication Required", 407);
		get.put("408 Request Timeout", 408);
		get.put("409 Conflict", 409);
		get.put("410 Gone", 410);
		get.put("411 Length Required", 411);
		get.put("412 Precondition Failed", 412);
		get.put("413 Payload Too Large", 413);
		get.put("414 Request-URI Too Long", 414);
		get.put("415 Unsupported Media Type", 415);
		get.put("416 Requested Range Not Satisfiable", 416);
		get.put("417 Expectation Failed", 417);
		get.put("418 I'm a teapot", 418);
		get.put("421 Misdirected Request", 421);
		get.put("422 Unprocessable Entity", 422);
		get.put("423 Locked", 423);
		get.put("424 Failed Dependency", 424);
		get.put("426 Upgrade Required", 426);
		get.put("428 Precondition Required", 428);
		get.put("429 Too Many Requests", 429);
		get.put("431 Request Header Fields Too Large", 431);
		get.put("444 Connection Closed Without Response", 444);
		get.put("451 Unavailable For Legal Reasons", 451);
		get.put("499 Client Closed Request", 499);
		get.put("500 Internal Server Error", 500);
		get.put("501 Not Implemented", 501);
		get.put("502 Bad Gateway", 502);
		get.put("503 Service Unavailable", 503);
		get.put("504 Gateway Timeout", 504);
		get.put("505 HTTP Version Not Supported", 505);
		get.put("506 Variant Also Negotiates", 506);
		get.put("507 Insufficient Storage", 507);
		get.put("508 Loop Detected", 508);
		get.put("510 Not Extended", 510);
		get.put("511 Network Authentication Required", 511);
		get.put("599 Network Connect Timeout Error", 599);
	}

}
