package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.controller.form.AppointmentForm;
//import com.transaction.model.Patient;
import com.transaction.service.Appointmentservice;

@RestController
public class BookAppointmentController
{
	@Autowired
	private Appointmentservice appointmentService;
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Appointment> findById(@PathVariable Long id) 
//	{
//		return ResponseEntity.ok(Appointmentservice.findById(id).orElse(null));
//	}
//	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody AppointmentForm appointmentForm) 
	{
		return appointmentService.bookAppointment(appointmentForm);
		
	}
	
	
//	@DeleteMapping("/delete/{id}")
//    public String delete(@PathVariable Long patientNumber)
//	{
//      return appointmentService.deletePatient(patientNumber);
//    }
}
