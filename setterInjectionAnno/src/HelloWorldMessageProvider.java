package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
@Component("hw")
public class HelloWorldMessageProvider implements MessageProvider {

 
 public String getMessage() {
 return "Hello World";
 }
}
