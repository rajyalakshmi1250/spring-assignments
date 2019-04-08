package com.capgemini.spring.provider;
import org.springframework.beans.factory.annotation.*;
public class HelloWorldMessageProvider implements MessageProvider {

 
 public String getMessage() {
 return "Hello World";
 }
}
