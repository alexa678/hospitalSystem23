package com.rishika.doctormicroservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishika.doctormicroservices.entity.DoctorDetails;
import com.rishika.doctormicroservices.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository docRepo;

	@Override
	public DoctorDetails registerDoctor(DoctorDetails doctordetails) {
		return docRepo.save(doctordetails);
	}

	@Override
	public List<DoctorDetails> getAllDoctors() {
		return docRepo.findAll();
	}
}
