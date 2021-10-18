package com.ssu.kuzmin.mvc.dao;

import com.ssu.kuzmin.mvc.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {
}
