package com.ssu.kuzmin.mvc.services;

import com.ssu.kuzmin.mvc.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment add(Appointment appointment);
    Appointment update(Appointment appointment) throws Exception;
    void delete(int id) throws Exception;
    Appointment getById(int id) throws Exception;
    List<Appointment> getAll();
}
