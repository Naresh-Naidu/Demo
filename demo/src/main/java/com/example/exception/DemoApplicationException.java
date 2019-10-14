
  package com.example.exception;
  
  import org.springframework.http.HttpStatus; import
  org.springframework.web.bind.annotation.ResponseStatus;
  
  public class DemoApplicationException extends RuntimeException {
  
  public DemoApplicationException() { super(); }
  
  public String getMessage() { return "This is error message"; } }
 