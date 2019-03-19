package bird.mocktail.me.exception;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import bird.mocktail.me.constants.ErrorCodes;
import bird.mocktail.me.json.exception.Error;
import bird.mocktail.me.json.exception.ErrorDetailsJSON;
import bird.mocktail.me.json.exception.Errors;

@ControllerAdvice
@RestController
public class MocktailBirdException extends ResponseEntityExceptionHandler {
	
	  private static final Logger logger = LoggerFactory.getLogger(MocktailBirdException.class);

	  @Autowired
	  ErrorDetailsJSON errorDetails;
	  
	  @Autowired
	  Errors errors;
		
	  public MocktailBirdException(ErrorDetailsJSON errorDetails) {
		super();
	  }
	  
	  @ExceptionHandler(CustomExceptionHandling.class)
	  @ResponseBody
	  public final ResponseEntity<ErrorDetailsJSON> handleCanvasIdNotFoundException(CustomExceptionHandling cex, WebRequest request) {
	      List<Error> errorlist = new ArrayList<>();
	      errorlist.add(new Error(cex.getCode(),cex.getMessage(),cex.getDevmsg(),cex.getMoreInfo()));
	      errors.setError(errorlist);
	      errorDetails.setErrors(errors);
	      return new ResponseEntity<ErrorDetailsJSON>(errorDetails, HttpStatus.BAD_REQUEST);
	  }
	  
	  @ExceptionHandler({ MethodArgumentTypeMismatchException.class })
	  public ResponseEntity<ErrorDetailsJSON> handleMethodArgumentTypeMismatch(
	    MethodArgumentTypeMismatchException ex, WebRequest request) {
	      String error = ex.getName() + " should be of type " + ex.getRequiredType().getName();
	      List<Error> errorlist = new ArrayList<>();
	      errorlist.add(new Error(ex.getErrorCode(), error ,ex.getMessage(),ex.getLocalizedMessage()));
	      errors.setError(errorlist);
	      errorDetails.setErrors(errors);
	     
	      return new ResponseEntity<ErrorDetailsJSON>(errorDetails, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	  }
	  

	  
	  @ExceptionHandler({ Exception.class })
	  public ResponseEntity<ErrorDetailsJSON> handleAll(Exception ex, WebRequest request) {
	      List<Error> errorlist = new ArrayList<>();
	      ex.printStackTrace();
	      errorlist.add(new Error(ErrorCodes.INTERNAL_ERROR.getKey().toString(), ErrorCodes.INTERNAL_ERROR.getValue() ,ex.getMessage(), ex.getStackTrace().toString()));
	      errors.setError(errorlist);
	      errorDetails.setErrors(errors);
	      return new ResponseEntity<ErrorDetailsJSON>(errorDetails, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}
	
