package bird.mocktail.me.constants;

public enum ErrorCodes {
	
	 
	IN_VALID_ID(4000, "Not a proper Request Id, Try the correct ");

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
