package bird.mocktail.me.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import bird.mocktail.me.constants.MocktailBirdConstants;

@Service
public class MocktailBirdUtils {
	
	/**
	 * method to validate the URL id
	 * @param id
	 * @return true/false
	 */
	public boolean isValidateURLId(String id) {
		
		 Pattern p = Pattern.compile(MocktailBirdConstants.ID_REGEX);
		 Matcher m = p.matcher(id);
		 boolean b = m.matches();
		
		return b;
	}

}
