package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.model.Appointment;

public interface Appointmentrepo extends JpaRepository<Appointment, Long>{

}
