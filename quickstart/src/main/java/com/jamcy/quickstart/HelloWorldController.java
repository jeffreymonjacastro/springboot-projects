package com.jamcy.quickstart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

  @GetMapping(path = "/hello")
  public String helloWorld() {
    return "Hello, Jamcy!";
  }
}
