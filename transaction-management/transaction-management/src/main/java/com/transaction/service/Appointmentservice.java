package com.transaction.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transaction.controller.form.AppointmentForm;
import com.transaction.model.Appointment;
import com.transaction.model.Patient;
import com.transaction.repository.Appointmentrepo;
import com.transaction.repository.Patientrepo;

@Service
public class Appointmentservice 
{
	@Autowired
	private Appointmentrepo appointmentrepo;
	
	@Autowired
	private Patientrepo patientrepo;
	
	public String bookAppointment(AppointmentForm appointmentForm)
	{
		
		Patient patient = new ObjectMapper().convertValue(appointmentForm, Patient.class);
		
		Long patientNumber = patientrepo.save(patient).getPatientNumber();
		
		System.out.println("Patient saved successfully.");
		
		Appointment appointment = new Appointment(1L, new Date(System.currentTimeMillis()), patientNumber, 101L);
		
		Long appointmentNumber = appointmentrepo.save(appointment).getAppointmentno();
	
		return "Appointment Confirmed."+appointmentNumber;
		
	}

}
