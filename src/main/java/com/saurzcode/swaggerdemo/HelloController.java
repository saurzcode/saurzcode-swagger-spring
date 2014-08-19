package com.saurzcode.swaggerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
public class HelloController {
	@RequestMapping(method=RequestMethod.GET,value="saurzcode/hello")
	@ApiOperation(httpMethod = "GET", value = "Say Hello To World using Swagger")
	public String sayHello() {
		return "Greetings from SaurzCode! ";
	}
	
	

}
