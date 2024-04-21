package com.rishika.springJwt.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rishika.springJwt.dto.Doctors;


@FeignClient(value="Doctor-Microservices")
public interface UserProxy {

	
	@PostMapping(value="/register/doctor", produces ="application/json")
	public Doctors registerDoctor(@RequestBody Doctors doctordetails, @RequestHeader("Authorization") String authorization);
	
	
	@GetMapping(value="/getalldoctors", produces = "application/json")
	public List<Doctors> getAllDoctors(@RequestHeader("Authorization") String authorization);
}
