package com.rishika.springJwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishika.springJwt.dto.Doctors;
import com.rishika.springJwt.model.AuthenticationResponse;
import com.rishika.springJwt.model.User;
import com.rishika.springJwt.proxy.UserProxy;
import com.rishika.springJwt.service.AuthenticationService;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

	@Autowired
    private AuthenticationService authService;
	
	@Autowired
	private UserProxy doctorProxy;

  
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody User request
            ) {
        return ResponseEntity.ok(authService.register(request));
    }
    
    @PostMapping(value="/register/doctor")
	public Doctors registerDoctor(@RequestBody Doctors doctordetails, @RequestHeader("Authorization") String authorization) {
    	return doctorProxy.registerDoctor(doctordetails, authorization);
    };
	

    
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody User request
    ) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
