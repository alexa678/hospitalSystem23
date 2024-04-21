package com.rishika.springJwt.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rishika.springJwt.dto.Patients;


@FeignClient(value="Patient-Microservices")
public interface AdminProxy {

	@PostMapping(value = "/api/register/patient",produces = "application/json")
	public Patients registerPatient(@RequestBody Patients patient, @RequestHeader("Authorization") String authorization);
	
	@GetMapping(value="/getallpatient",produces = "application/json")
	public List<Patients> getAllPatients(@RequestHeader("Authorization") String authorization);
}
