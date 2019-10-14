
package com.example.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomeException extends ResponseEntityExceptionHandler {

	@ExceptionHandler({NullPointerException.class })
	public ResponseEntity<Object> handleNullexception(Exception ex) {
		ErrorDetails er=new ErrorDetails(); 
		er.setDetails("There is Bad request");
		er.setMessage("we have got null value"); 
		er.setTimeStamp(new Date()); 
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler({ ArithmeticException.class})
	public ResponseEntity<Object> handleArihmaticException(Exception e) {
		ErrorDetails er = new ErrorDetails();
		er.setDetails("There is no details");
		er.setMessage("we have got number evalution problem");
		er.setTimeStamp(new Date());
		return new ResponseEntity<Object>(er, HttpStatus.OK);
	}

}