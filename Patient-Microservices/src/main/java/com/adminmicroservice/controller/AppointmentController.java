package com.adminmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminmicroservice.entity.Appointment;
import com.adminmicroservice.service.AppointmentService;


@RestController
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/book")
	public Appointment bookAppointment(@RequestBody Appointment appointment) {
		return appointmentService.bookAppointment(appointment);
		
	}
	
	@GetMapping("/display")
	public List<Appointment> displayAppointments(){
		return appointmentService.getAllAppointments();
	}
}
