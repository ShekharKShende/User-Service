package com.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${synerzip.user.bu}")
	private String userBU;
	
	@RequestMapping(value ="/api/v1/data", method= RequestMethod.POST)
	public ResponseEntity<String> getData() {
		
		return new ResponseEntity<String>(userBU, HttpStatus.OK);
	}
}
