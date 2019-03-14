package bird.mocktail.me.exception;

public class CustomExceptionHandling extends RuntimeException {
	String code;
	String message;
	String devmsg;
	String moreInfo;
	
	private static final long serialVersionUID = 1L;

	public CustomExceptionHandling(String code, String message, String devMsg, String moreInfo) {
		this(code, message, devMsg);
		this.moreInfo = moreInfo;
	}
	
	public CustomExceptionHandling(String code, String message, String devMsg) {
		this(code, message);
		this.devmsg = devMsg;
	}
	
	public CustomExceptionHandling(String code, String message) {
		super( message);
		this.code = code;
		this.message = message;
	}
	
	
	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getDevmsg() {
		return devmsg;
	}

	public String getMoreInfo() {
		return moreInfo;
	}	
}
