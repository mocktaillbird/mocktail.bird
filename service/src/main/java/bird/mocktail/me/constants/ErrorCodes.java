package bird.mocktail.me.constants;

public enum ErrorCodes {
	
	 
	INVALID_ID(4000, "Not a proper Request Id, Try the correct one."),
	INVALID_REQUEST(4001, "No data found for this request.");

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
