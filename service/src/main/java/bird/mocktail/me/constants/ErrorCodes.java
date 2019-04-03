package bird.mocktail.me.constants;

public enum ErrorCodes {
	
	 
	INVALID_ID(4000, "Not a proper Request Id, Try the correct one."),
	INVALID_REQUEST(4001, "Not proper call/No data found for this request."),
	INTERNAL_ERROR(4002, "Internal Server error occrued"),
	NUMBERFORMAT_ERROR(4003, "Not a proper input number, formatting exception");

    private final Integer key;
    private final String value;

    ErrorCodes(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

	public Integer getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

    

}
