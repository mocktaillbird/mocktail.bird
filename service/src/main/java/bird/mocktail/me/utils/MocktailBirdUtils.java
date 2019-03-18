package bird.mocktail.me.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import bird.mocktail.me.constants.MocktailBirdConstants;
import bird.mocktail.me.constants.StatusCodes;
import bird.mocktail.me.json.UserMockResponse;
import bird.mocktail.me.pojos.StatusCodeMapping;

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
	
	
	public HttpStatus  sendCorrectStatus(UserMockResponse usermockresp) {
		StatusCodeMapping statusCodeM = new StatusCodeMapping(0, "" , null);
		if(null != usermockresp.getStatusCode() ) {
			statusCodeM = StatusCodes.mapper.get(usermockresp.getStatusCode());
		}
		return statusCodeM.getHttpStatus();
	}
	
	public Date addFiveDays(Date dt) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, 5);
		return c.getTime();
	}
	
	public Date addFiveMinutes(Date dt) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.MINUTE, 5);
		return c.getTime();
	}
	

}
